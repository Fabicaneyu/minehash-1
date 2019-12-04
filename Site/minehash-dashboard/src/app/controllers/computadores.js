const { Computador, Processo, Desempenho } = require('../models')

class ComputadoresController {

  async get(req, res) {

    await Computador.findOne({
      where: {fkUsuario: req.user.idUsuario}
    }).then(results => {

      return res.status(200).json({
        success: true,
        message: 'OK',
        data: results
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

  async getDetails(req, res) {
    
    const processos = async id => {
      return await Processo.findAll({
        where: {fkComputador: id},
        raw : true
      }).then(results => [results])
      .catch(err => err);
    };

    const desempenhos = async id => {
      return await Desempenho.findAll({
        where: {fkComputador: id},
        raw : true
      }).then(results => [results])
      .catch(err => err);
    };

    const computadores = await Computador.findAll({
      where: {fkUsuario: req.user.idUsuario}
    }).then(results => {
    })
    .catch(err => err);

    // return res.status(200).json({
    //   success: true,
    //   data: desempenhos(1016)
    // });

    await Promise.all(computadores.map(async cmp => {
      const prcs = await processos(cmp.idComputador);
      const dsps = await desempenhos(cmp.idComputador);

      return Object.assign({}, {
        idComputador: cmp.idComputador,
        nmGpu: cmp.nmGpu,
        nmDisco: cmp.nmDisco,
        nmRam: cmp.nmRam,
        nmProcessador: cmp.nmProcessador,
        nmSo: cmp.nmSo,
        nmHostname: cmp.nmHostname,
        nmModelo: cmp.nmModelo,
        nmFabricante: cmp.nmFabricante,
        obDesempenho: dsps.map(dsp => {
          return Object.assign({}, {
            idDesempenho: dsp.idDesempenho,
            nrCpu: dsp.nrCpu,
            nrRam: dsp.nrRam,
            nrDisco: dsp.nrDisco,
            nrGpu: dsp.nrGpu,
            nrTemperatura: dsp.nrTemperatura
          });
        })//,
        // obProcessos: prcs.map(prc => {
        //   return Object.assign({}, {
        //     idProcesso: prc.idProcesso,
        //     nrPid: prc.nrPid,
        //     nmProcesso: prc.nmProcesso,
        //     dtDatahora: prc.dtDatahora
        //   });
        // })
      });
    })).then(results => {
      return res.status(200).json({
        success: true,
        message: 'OK',
        data: results
      });
    }).catch(err => {
      console.log('Detalhes', err);
      return res.status(500).json({
        success: false,
        message: 'Ocorreu um erro, tente novamente.',
        error: err
      });
    });
  }

}

module.exports = new ComputadoresController();
