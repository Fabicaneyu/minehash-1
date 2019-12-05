const { Processo, Computador } = require('../models')

class ProcessosController {

  async post(req, res) {

    await Processo.findAll({
      where: {fkComputador: req.body.idComputador},
      limit: 20
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
