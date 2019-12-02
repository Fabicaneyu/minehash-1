const { Desempenho } = require('../models')

class DesempenhosController {
  async get(req, res) {

    await Desempenho.findAll({
      where: {fkComputador: req.body.idComputador}
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

module.exports = new DesempenhosController();
