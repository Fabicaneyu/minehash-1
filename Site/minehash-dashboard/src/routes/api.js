const express = require('express');
const routes = express.Router();

// Declacao de Controllers

const SessionsController = require('../app/controllers/auth');
const UsuarioController = require('../app/controllers/usuarios');
const DesempenhosController = require('../app/controllers/desempenhos');
const ProcessosController = require('../app/controllers/processos');
const ComputadoresController = require('../app/controllers/computadores');
const ErrorController = require('../app/controllers/erros');

// Rota de Erro

routes.get(ErrorController.api);

// Rotas Usuário

routes.get('/usuarios/:email', UsuarioController.get); // GET Dados do Usuário
routes.post('/usuarios', UsuarioController.post); // POST Cadastrar Usuario
routes.put('/usuarios/:email', UsuarioController.put); // PUT Atualizar Cadastro (INSTAVEL)

routes.get('/usuarios/logout', SessionsController.get); // GET Fazer Logout
routes.post('/usuarios/login', SessionsController.post); // POST Fazer Login

// Rotas Computador

routes.get('/computadores', ComputadoresController.post); // GET Lista de Computadores atrelados ao Usuário

// Rotas Detalhes do Computador

routes.get('/desempenhos/:computador', DesempenhosController.post); // GET Dados de Desempenho do Computador

routes.get('/processos/:computador', ProcessosController.post); // GET Dados de Processos do Computador

// routes.get('/');
module.exports = routes;
