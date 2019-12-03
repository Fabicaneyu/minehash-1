const auth = require('../../config/auth');
const { Usuario } = require('../models');

class SessionsController {

  get(req, res) {
    req.logout();
    res.redirect('/');
  }

  getLogin(req, res) {
    res.render('/', { message: req.flash('loginMsg')});
  }

  isLoggedIn(req, res, next) {
    console.log('Existe autenticacao?', req.isAuthenticated());
    if (req.isAuthenticated()) {
      return next();
    }

    res.redirect('/');
  }

  getLoggedUser(req, res) {
    return res.status(200).json({
      success: true,
      auth: true,
      message: 'OK',
      data: req.user
    })
  }

}

module.exports = new SessionsController();