const jwt = require('jsonwebtoken');
const auth = require('../../config/auth');
const { Usuario } = require('../models');
const errHandler = require('../error-handler');

class UsuarioController {

  // GET
  async get(req, res) {
    const { nm_email } = req.params;
    await Usuario.findOne({
      where: { nm_email }
    });
  }

  async post(req, res) {
    await Usuario.create(req.body).then(results => {
      return res.status(200).json({
        success: true,
        message: 'OK',
        data: results
      });
    }).catch(err => {
      return res.status(500).json({
        success: true,
        message: 'Algo deu errado, tente novamente.',
        error: err
      });
    });
  }

  async put(req, res) {
    await Usuario.update({
      password: password
    }, {
        where: {nm_login : nm_login}
      }).then(results => {
        return res.status(200).json({
          success: true,
          message: 'OK',
          data: results
        });
      }).catch(err => {
        return res.status(500).json({
          success: false,
          message: 'Algo deu errado, tente novamente.',
          error: err
      });
    });
  }
}

module.exports = new UsuarioController();
