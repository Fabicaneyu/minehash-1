const express = require('express');
// const bodyParser = require('body-parser');
const cors = require('cors');
const path = require('path');
const logger = require('morgan');
const passport = require('passport');
const routes = {
  api: require('./routes/api'),
  session: require('./routes/session')
};


class App {
  constructor() {
    require('./app/passport');
    this.express = express();
    this.isEnvDev = process.env.node_ENV =! 'production';
    this.middlewares();
    this.routes();
  }

  middlewares() {
    this.express.use(cors());
    this.express.use(express.urlencoded({ extended: false }));
    this.express.use(express.json());
    this.express.use(logger('dev'));
    this.express.use(passport.initialize());
    this.express.use(express.static(path.join(__dirname, 'public')));
  }

  routes() {
    this.express.use(passport.authenticate('local', {session: false}), routes.api);
    this.express.use(routes.session);
  }
}

module.exports = new App().express;
