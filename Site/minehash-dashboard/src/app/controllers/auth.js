const jwt = require('jsonwebtoken');
const auth = require('../../config/auth');
const passport = require('passport');

const { Usuario } = require('../models');

class SessionsController {

  get(req, res) {
  }

  async post(req, res) {
    passport.authenticate('local', {session: false}, (err, user) => {
      if (err) return res.status(500).json({
        success: false,
        auth: false,
        message: 'Algo deu errado, tente novamente.', 
        error: err
      });

      if (!user) return res.status(400).json({
        success: false,
        auth: false,
        message: 'Usuário não encontrado.',
        error: user
      });

      req.login(user, {session: false}, err => {
        if (err) return res.status(500).json({
          success: false,
          auth: false,
          message: 'Algo deu errado, tente novamente.',
          error: err
        });

        const token = jwt.sign(user, auth.secret);

        return res.status(200).json({
          success: true,
          message: 'OK',
          token: token,
          data: user
        });
      });
    });
  }

  verificarToken(email, password, done) {
  }
}

module.exports = new SessionsController();