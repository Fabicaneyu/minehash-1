const { Computador, Processo, Desempenho } = require('../models')

class ComputadoresController {

  async get(req, res) {

    await Computador.findAll({
      where: {fkUsuario: req.user.idUsuario}
    }).then(results => {
      return res.status(200).json({
        success: true,
        message: 'OK',
        data: results
      });
    }).catch(err => {
      return res.status(500).json({
        success: false,
        message: 'Algo deu errado, tente novamente.',
        error: err
      });
    });
  }

  async getDetails(req, res) {
    
    // const processos = (id) => await Processo.findAll({
    //   where: {fkComputador: id}
    // }).then(results => results)
    // .catch(err => err);

    // const desempenho = (id) => await Desempenho.findAl({
    //   where: {fkComputador: id}
    // }).then(results => results)
    // .catch(err => err);

    // await Computador.findAll({
    //   where: {fkUsuario: req.user.idUsuario}
    // }).then(results => {
    //   //
    // })
  }

}

module.exports = new ComputadoresController();
