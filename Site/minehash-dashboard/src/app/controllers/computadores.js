const { Computador } = require('../models')

class ComputadoresController {
  async post(req, res) {
    Computador.findAll({
      where: {fkMinerador: idUsuario}
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
}

module.exports = new ComputadoresController();
