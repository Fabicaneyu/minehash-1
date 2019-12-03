const LocalStrategy = require('passport-local').Strategy;

const { Usuario } = require('../app/models');

module.exports = (passport) => {
  passport.serializeUser((user, done) => {
    console.log('Usuario', user.idUsuario)
    done(null, user.idUsuario);
  });

  passport.deserializeUser((id, done) => {
    Usuario.findOne({
      where: {idUsuario: id}
    }).then(results => {
      done(null, results);
    }).catch(err => {
      done(err);
    });
  });

  passport.use('local-login', new LocalStrategy({
    usernameField: 'email',
    passwordField: 'senha',
    passReqToCallback: true
  }, (req, email, senha, done) => {
    Usuario.findOne({
      where: {nmEmail: email}
    }).then(results => {
      if (!results) {
        return done('Usuario nao existe.', false, req.flash('loginMsg', 'Usuario nao existe.'));
      }

      if (results.nmSenha !== senha) {
        return done('Senha incorreta.', false, req.flash('loginMsg', 'Senha incorreta.'));
      }

      return done(null, results);
    });
  }));
}