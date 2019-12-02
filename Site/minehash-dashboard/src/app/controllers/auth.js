const jwt = require('jsonwebtoken');
const auth = require('../../config/auth');
const errHandler = require('../error-handler');

class SessionsController {

  async post(req, res) {
    const { nm_email, nm_senha } = req.body;

    const result = await Usuario.findOne({
      where: { nmEmail: nm_email }
    });

    if (!result) {
      return res.status(404).json(errHandler.pageError(404));
    }

    if (!await result.checkPassword(nm_senha)) {
      return res.status(401).json(errHandler.pageError(401));
    }

    jwt.sign(result.idUsuario, auth.secret, {
      expiresIn: auth.ttl
    });

    return res.json({
      success: true,
      message: 'OK',
      data: result
    });
  }

  verificarToken(req, res, next) {
    const token = req.headers['x-access-token'];

    if (!token) return res.status(401).send(errHandler.pageError(401));

    jwt.verify(token, auth.secret, (err, decoded) => {
      if (err) return res.status(500).send(errHandler.pageError(500));

      req.id_usuario = decoded.id;
      next();
    });
  }

  get(req, res) {
    res.status(200).send({
      auth: false,
      token: null
    });
  }
}

module.exports = new SessionsController();
