const express = require('express');
const routes = express.Router();

const SessionsController = require('../app/controllers/auth');


routes.get('/logout', SessionsController.get); // GET Fazer Logout
routes.post('/login', SessionsController.post); // POST Fazer Login

module.exports = routes;