const express = require('express');
const routes = express.Router();
const passport = require('passport');
const SessionsController = require('../app/controllers/session');

routes.get('/logout', SessionsController.get); // GET Fazer Logout

routes.post('/login', passport.authenticate('local-login', {
    successRedirect: '/dashboard',
    failureRedirect: '/',
    failureFlash: true
  })); // POST Fazer Login

module.exports = routes;

// (req, res, next) => { console.log('Corpo LOGIN', req.body); next()}