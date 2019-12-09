const { Desempenho } = require('../models');

class DesempenhosController {

  async post(req, res) {
    const { Op } = require('sequelize');

    let somaCPU = 0;
    let somaRAM = 0;
    let somaDisco = 0;
    let somaGPU = 0;
    let somaTempCPU = 0;
    let somaTempGPU = 0;

    const formatter = data => {
      if (data == null || typeof data === 'null' || typeof data === 'undefined') return 0;
      let str = `${data}`;

      if (str.endsWith(' GiB') || str.endsWith(' MiB')) {
        str = str.substring(0, str.length - 4);
      }

      return Number(str.replace(',', '.'));
    };

    const somador = data => {
      return somaCPU += formatter(data.nrCpu),
      somaRAM += formatter(data.nrRam),
      somaDisco += formatter(data.nrDisco),
      somaGPU += formatter(data.nrGpu),
      somaTempCPU += formatter(data.nrTemperaturaCpu),
      somaTempGPU += formatter(data.nrTemperaturaGpu);
    }

    const datas = {
      hoje: new Date().toISOString(),
      semanaPassada: new Date(Date.now()-604800000).toISOString()
    }

    await Desempenho.findAll({
      where: {
        fkComputador: req.body.idComputador,
        dtDatahora: {
          [Op.between]: [datas.semanaPassada, datas.hoje]
        }
      },
      order: [['dtDatahora', 'DESC']],
      limit: 15
    }).then(results => {
      const resObject = results.map(result => {
        somador(result);

        return Object.assign({}, {
          nrCpu: formatter(result.nrCpu), // Porcentagem de Consumo
          nrRam: formatter(result.nrRam), // Consumo em MiB
          nrDisco: formatter(result.nrDisco), // Porcentagem de Consumo
          nrGpu: formatter(result.nrGpu), // Porcentagem de Consumo
          nrTemperaturaCpu: formatter(result.nrTemperaturaCpu), // Temperatura da CPU
          nrTemperaturaGpu: formatter(result.nrTemperaturaGpu), // Temperatura da GPu
          dtDatahora: new Date(result.dtDatahora).getTime() // Horário formatado em numeral para posterior consulta
        });
      });

      return res.status(200).json({
        success: true,
        message: 'OK',
        data: {
          media: resObject.length,
          totais: {
            nrCpu: somaCPU,
            nrRam: somaRAM,
            nrDisco: somaDisco,
            nrGpu: somaGPU,
            nrTemperaturaCpu: somaTempCPU,
            nrTemperaturaGpu: somaTempGPU
          },
          desempenho: resObject
        }
      });
    }).catch(err => {
      console.log(err);
      return res.status(500).json({
        success: false,
        message: 'Algo deu errado, tente novamente.',
        error: err
      });
    });
  }

}

module.exports = new DesempenhosController();
