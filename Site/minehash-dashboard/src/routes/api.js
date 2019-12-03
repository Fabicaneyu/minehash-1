const express = require('express');
const routes = express.Router();

// Declacao de Controllers

const UsuarioController = require('../app/controllers/usuarios');
const DesempenhosController = require('../app/controllers/desempenhos');
const ProcessosController = require('../app/controllers/processos');
const ComputadoresController = require('../app/controllers/computadores');


// Rotas Usuário

routes.get('/usuarios', UsuarioController.get); // GET Dados do Usuário
routes.post('/usuarios', UsuarioController.post); // POST Cadastrar Usuario
routes.put('/usuarios', UsuarioController.put); // PUT Atualizar Cadastro (apenas Senha)

// Rotas Computador

routes.post('/computadores', ComputadoresController.post); // GET Lista de Computadores atrelados ao Usuário

// Rotas Detalhes do Computador

routes.post('/desempenhos', DesempenhosController.post); // GET Dados de Desempenho do Computador

routes.get('/processos', ProcessosController.post); // GET Dados de Processos do Computador

// routes.get('/');
module.exports = routes;
