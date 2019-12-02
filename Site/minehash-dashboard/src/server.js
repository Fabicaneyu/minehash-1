const express = require('express');
const cors = require('cors');
const path = require('path');
const logger = require('morgan');
const routes = {
  api: require('./routes/api'),
  token: require('./app/controllers/auth')
}


class App {
  constructor() {
    this.express = express();
    this.isEnvDev = process.env.node_ENV =! 'production';
    this.middlewares();
    this.routes();
  }

  middlewares() {
    this.express.use(cors());
    this.express.use(express.json());
    this.express.use(logger('dev'));
    this.express.use(express.urlencoded({ extended: false }));
    this.express.use(express.static(path.join(__dirname, 'public')));
  }

  routes() {
    this.express.use('/', routes.token.verificarToken);
    this.express.use('/api/v0', routes.token.verificarToken, routes.api);
    this.express.use('/dev', routes.errors);
  }
}

module.exports = new App().express;
