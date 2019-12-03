const { Desempenho } = require('../models')

class DesempenhosController {
  async post(req, res) {
    const { idComputador } = req.body;

    await Desempenho.findAll({
      where: {fkComputador: idComputador}
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
