const { Processo } = require('../models')

class ProcessosController {

  async post(req, res) {

    await Processo.findAll({
      where: {fkComputador: req.body.idComputador},
      order: [['dtDatahora', 'DESC']],
      limit: 21,
      raw: true
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

module.exports = new ProcessosController();
