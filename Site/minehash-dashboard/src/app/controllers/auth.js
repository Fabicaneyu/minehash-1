const jwt = require('jsonwebtoken');
const auth = require('../../config/auth');
const errHandler = require('../error-handler');
const { Usuario } = require('../models');

class SessionsController {

  get(req, res, next) {
    res.status(200).send({
      auth: false,
      token: null
    });
    next();
  }

  async post(req, res) {
    const { nmEmail, nmSenha } = req.body;

    const result = await Usuario.findOne({
      where: {nmEmail: nmEmail}
    }).then(results => {
      if (!this.checkPassword(nmSenha)) {
        return res.status(404).json(errHandler.pageError(404));
      } else {
        jwt.sign(results.idUsuario, auth.secret, {
          expiresIn: auth.ttl
        });

        return res.status(200).json({
          success: true,
          message: 'OK',
          data: result
        });
      }
    }).catch(err => {
      return res.status(500).json({
        success: false,
        message: 'Algo deu errado, tente novamente.',
        err: err
      });
    });
  }

  verificarToken(req, res, next) {
    const token = req.body['token'];

    if (!token) return res.status(401).send(errHandler.pageError(401));

    jwt.verify(token, auth.secret, (err, decoded) => {
      if (err) return res.status(500).send(errHandler.pageError(500));

      req.id_usuario = decoded.idUsuario;
      next();
    });
  }
}

module.exports = new SessionsController();
