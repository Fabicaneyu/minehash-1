const { Usuario } = require('../models');

class UsuarioController {

  async get(req, res) {
    await Usuario.findAll().then(results => {
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

  async post(req, res) {
    if (!Usuario.isEmailUnique(req.body.nmEmail)) {
      return res.json({
        success: true,
        message: 'Email já registrado.'
      });
    }

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
    const { nmEmail, nmSenha } = req.body;

    await Usuario.update(
      {nmSenha: nmSenha},
      {where: {nmEmail: nmEmail},
      individualHooks: true
    }).then(results => {
        if (results == 0) {
          return res.status(400).json({
            success: false,
            message: 'Algo deu errado, tente novamente.'
          });
        } else {
          return res.status(200).json({
            success: true,
            message: 'OK',
            data: results
          });
        }
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
