const express = require('express');
const cors = require('cors');
const passport = require('passport');

const logger = require('morgan');
const path = require('path');
const cookieParser = require('cookie-parser');
const session = require('express-session');
const flash = require('connect-flash');

const SessionController = require('./app/controllers/session');

const auth = require('./config/auth');
const routes = {
  api: require('./routes/api'),
  session: require('./routes/session')
}

class App {
  constructor() {
    this.express = express();
    this.isEnvDev = process.env.node_ENV =! 'production';
    this.middlewares();
    this.routes();
  }

  middlewares() {
    require('./config/passport')(passport);
    this.express.use(logger('dev'));
    this.express.use(cookieParser());
    this.express.use(cors());

    this.express.use(session({ 
      secret: auth.secret,
      resave: true,
      saveUninitialized: true,
      cookie: { secure: false }
    }));

    this.express.use(passport.initialize());
    this.express.use(passport.session());
    this.express.use(flash());

    this.express.use(express.urlencoded({ extended: false }));
    this.express.use(express.json());
    // this.express.use(express.static(path.join(__dirname, 'public/')));
  }

  routes() {
    this.express.use(routes.api);
    this.express.use(routes.session);
    this.express.use('/', express.static(path.join(__dirname, 'public/index')));
    this.express.use('/dashboard', SessionController.isLoggedIn, express.static(path.join(__dirname, 'public/dashboard')));
  }
}

module.exports = new App().express;
