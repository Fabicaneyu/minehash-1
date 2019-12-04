const { Desempenho } = require('../models')

class DesempenhosController {

  async post(req, res) {
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

    await Desempenho.findAll({
      where: {fkComputador: req.body.idComputador}
    }).then(results => {
      const resObject = results.map(result => {
        somador(result);

        return Object.assign({}, {
          nrCpu: formatter(result.nrCpu), // Porcentagem de Consumo
          nrRam: formatter(result.nrRam), // Consumo em MiB
          nrDisco: formatter(result.nrDisco), // Porcentagem de Consumo
          nrGpu: formatter(result.nrGpu), // Porcentagem de Consumo
          nrTemperaturaCpu: formatter(result.nrTemperaturaCpu), 
          nrTemperaturaGpu: formatter(result.nrTemperaturaGpu)
        });
      });

      return res.status(200).json({
        success: true,
        message: 'OK',
        data: {
          media: resObject.length,
          somas: {
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
