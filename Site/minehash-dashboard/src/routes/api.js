const path = require('path');
const express = require('express');
const routes = express.Router();

// Declacao de Controllers

const UsuarioController = require('../app/controllers/usuarios');
const DesempenhosController = require('../app/controllers/desempenhos');
const ProcessosController = require('../app/controllers/processos');
const ComputadoresController = require('../app/controllers/computadores');
const SessionController = require('../app/controllers/session');

// Rotas Usuário

routes.get('/usuarioLogado', SessionController.isLoggedIn, SessionController.getLoggedUser);
routes.get('/usuarios', UsuarioController.get); // GET Dados do Usuário
routes.post('/usuarios', UsuarioController.post); // POST Cadastrar Usuario
routes.put('/usuarios', UsuarioController.put); // PUT Atualizar Cadastro (apenas Senha)

// Rotas Computador

routes.get('/computadores', SessionController.isLoggedIn, ComputadoresController.get); // GET Lista de Computadores atrelados ao Usuário
routes.get('/detalhes', SessionController.isLoggedIn, ComputadoresController.getDetails); // GET TUDO

// Rotas Detalhes do Computador

routes.post('/desempenhos', SessionController.isLoggedIn, DesempenhosController.post); // GET Dados de Desempenho do Computador
routes.post('/desempenhosLimite', SessionController.isLoggedIn, DesempenhosController.postLimite)

routes.post('/processos', SessionController.isLoggedIn, ProcessosController.post); // GET Dados de Processos do Computador

module.exports = routes;
