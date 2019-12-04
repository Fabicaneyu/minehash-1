const passport = require('passport');
const LocalStrategy = require('passport-local').Strategy;

const { Usuario } = require('./models');

passport.use(new LocalStrategy({
  usernameField: 'nmEmail',
  passwordField: 'nmSenha'
}, (email, password, done) => {
  return Usuario.findOne({
    where: {nmEmail: email}
  }).then(results => {
    if (!results) {
      return done(null, false, {success: false, auth: false, message: 'Usuário não encontrado.', error: 404});
    }

    if (results.nmSenha !== password) {
      return done(null, false, {success: false, auth: false, message: 'Senha incorreta.', error: 401});
    }

    return done(null, results, {success: true, auth: true, message: 'Login bem sucedido.'});
  }).catch(err => {
    return  done(err);
  });
}));