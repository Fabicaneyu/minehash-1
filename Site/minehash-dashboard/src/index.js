const server = require('./server');
const port = process.env.PORT || 3000;

const { Op } = require('sequelize');

const botConfig = require('./config/bot');
const TelegramBot = require('node-telegram-bot-api');
const bot = new TelegramBot(botConfig.token, {polling: true});
const { Usuario, Computador, Desempenho } = require('./app/models');

setInterval(() => {
  Usuario.findAll({
    where: {idTelegram: {[Op.ne]: null}},
    raw: true
  }).then(results => {
    const comp = async id => await Computador.findAll({where: {fkUsuario: id}, raw: true})
    .then(results => results).catch(err => err);

    const desp = async id => await Desempenho.findAll({where: {fkComputador: id}, order: [['dtDatahora', 'DESC']], raw: true, limit: 1})
    .then(results => results).catch(err => err);

    results.map(usuario => {
      comp(usuario.idUsuario).map(computador => {
        desp(computador.idComputador).map(desempenho => {
          if (desempenho.nrCpu > 90) return bot.sendMessage(usuario.idTelegram, `Alerta de Consumo de CPU! ${desempenho.nrCpu} da máquina ${computador.nmHostname}`);
          if (desempenho.nrGpu > 98) return bot.sendMessage(usuario.idTelegram, `Alerta de Consumo de GPU! ${desempenho.nrGpu} da máquina ${computador.nmHostname}`);
          if (desempenho.nrTemperaturaCpu > 98) return bot.sendMessage(usuario.idTelegram, `Alerta de Temperatura de CPU! ${desempenho.nrTemperaturaCpu} da máquina ${computador.nmHostname}`);
          if (desempenho.nrTemperaturaGpu > 98) return bot.sendMessage(usuario.idTelegram, `Alerta de Temperatura de GPU! ${desempenho.nrTemperaturaGpu} da máquina ${computador.nmHostname}`);
        })
      })
    });
  }).catch(err => err);
}, 15000);

const verificador = (msg) => {
  if (msg.chat.type !== 'private') return bot.sendMessage(msg.chat.id, 'Este chat não é privado (Direct Messages).');
};

const formatter = data => {
  if (data == null || typeof data === 'null' || typeof data === 'undefined') return 0;
  let str = `${data}`;

  if (str.endsWith(' GiB') || str.endsWith(' MiB')) {
    str = str.substring(0, str.length - 4);
  }

  return Number(str.replace(',', '.'));
};

// /start
bot.onText(/\/start/, msg => {
  verificador(msg);

  bot.sendMessage(msg.chat.id, `Bem-vindo(a), ${msg.from.first_name}. Sou o bot de alertas do Grupo MineHash.\n
  para usar as minhas funcionalidades segue abaixo uma lista delas no seu teclado, espero que ajude!`, {
    reply_markup: {
      keyboard: [['/vincularConta'], ['/desvincularConta'], ['/statusComputador']],
      resize_keyboard: true,
      force_reply: true
    }
  });
});

bot.on('message', msg => {
  if (msg.text === '/vincularConta') {
    return bot.sendMessage(msg.chat.id, 'Comando: /vincularConta\nUso: /vincularConta <email>');
  }
})

// vincularConta <email>
bot.onText(/\/vincularConta (.+)/, async (msg, match) => {
  const chatId = msg.chat.id;
  const email = match[1].toString();


  verificador(msg);

  if (!email.includes('@')) {
    return bot.sendMessage(chatId, 'E-mail inválido.');
  }

  await Usuario.count({ where: {nmEmail: email} }).then(async results => {
    
    if (results < 1) {
      return bot.sendMessage(chatId, 'E-mail não encontrado.');
    }

    await Usuario.count({ where: {idTelegram: chatId} }).then(async results => {

      if (results > 0) {
        return bot.sendMessage(chatId, 'Este Telegram já está vinculado.');
      }

      await Usuario.update({
        idTelegram: chatId
      }, {
        where: {nmEmail: email}
      }).then(results => {
        if (results[0] === 0) {
          return bot.sendMessage(chatId, 'Falha ao tentar.');
        }
    
        console.log('tentativa:', results);
        return bot.sendMessage(chatId, 'Telegram vinculado com sucesso!');
      }).catch(err => {
        console.log(err);
        return bot.sendMessage(chatId, 'Falha interna do servidor, tente novamente mais tarde.');
      });
  
    }).catch(err => {
      console.log(err);
      return bot.sendMessage(chatId, 'Falha interna do servidor, tente novamente mais tarde.');
    });

  }).catch(err => {
    console.log(err);
    return bot.sendMessage(chatId, 'Falha interna do servidor, tente novamente mais tarde.');
  });
});

// /desvincularConta
bot.onText(/\/desvincularConta/, msg => {
  const chatId = msg.chat.id;

  verificador(msg);

  Usuario.update({
    idTelegram: null
  }, {
    where: {idTelegram: msg.chat.id}
  }).then(results => {
    if (results === 0) {
      return bot.sendMessage(chatId, 'Usuário não encontrado');
    }

    return bot.sendMessage(chatId, 'Telegram desvinculado com sucesso!');
  }).catch(err => {
    console.log(err);
    return bot.sendMessage(chatId, 'Falha interna do servidor, tente novamente mais tarde.');
  });
});

// /statusComputador
bot.onText(/\/statusComputador/, msg => {
  const chatId = msg.chat.id;

  verificador(msg);

  const desempenhos = async id => {
    return Desempenho.findAll({
      where: {fkComputador: id},
      raw : true,
      limit: 1
    }, {
      order: [['dtDatahora', 'DESC']],
    }).then(results => [results])
    .catch(err => {
      console.log(err);
      return bot.sendMessage(chatId, 'Falha interna do servidor, tente novamente mais tarde.');
    });
  };

  const computador = (id) => Computador.findAll({
    where: {fkUsuario: id},
    raw: true
  }).then(results => results)
  .catch(err => {
    console.log(err);
    return bot.sendMessage(chatId, 'Falha interna do servidor, tente novamente mais tarde.');
  });

  Usuario.findOne({
    where: {idTelegram: chatId}
  }).then(results => {
    if (!results || results == null) {
      return bot.sendMessage(chatId, 'Suas informações não foram encontradas, por favor use \"/vincularConta\"');
    }

    const mensagem = 'Último consumo registrado:';
    computador(results.idUsuario).map(cmp => {
      const dsp = desempenhos(cmp.idComputador);
      
      return mensagem += `\n
        Computador: ${cmp.nmHostname}\n
        CPU: ${dsp.nrCpu + '%' || 'Nenhum dado registrado'}\n
        Memória RAM: ${dsp.nrRam + '%' || 'Nenhum dado registrado'}\n
        Armazenamento: ${dsp.nrDisco + '%' || 'Nenhum dado registrado'}\n
        Placa de Vídeo: ${dsp.nrGpu + '%' || 'Nenhum dado registrado'}\n
        Temperatura da CPU: ${dsp.nrTemperaturaCpu + '°C' || 'Nenhum dado registrado'}\n
        Temperatura da GPU: ${dsp.nrTemperaturaGpu + '°C' || 'Nenhum dado registrado'}\n\n`;
    });

    if (mensagem === 'Último consumo registrado:') {
      return bot.sendMessage(chatId, 'Nenhum dado do computador registrado.');
    }
    return bot.sendMessage(chatId, mensagem);
  }).catch(err => {
    console.log(err);
    return bot.sendMessage(chatId, 'Falha interna do servidor, tente novamente mais tarde.');
  });
});

// Alertas
setInterval(() => {

  const computador = (id) => Computador.findAll({
    where: {fkUsuario: id},
    raw: true
  }).then(results => results)
  .catch(err => {
    console.error(err);
  });

  const desempenhos = async id => {
    return Desempenho.findAll({
      where: {fkComputador: id},
      raw : true,
      limit: 1
    }, {
      order: [['dtDatahora', 'DESC']],
    }).then(results => [results])
    .catch(err => {
      console.error(err);
    });
  };

  Usuario.findAll({
    where: {idTelegram: {
      [Op.ne]: null
    }},
    raw: true
  }).then(results => {
    results.map(user => {
      computador(user.idUsuario).map(cmp => {
        const dsp = desempenhos(cmp.idComputador);
  
        if (formatter(dsp.nrCpu) > 90) {
          return bot.sendMessage(user.idTelegram, `Alerta de consumo de CPU!\n Valor Atual: ${dsp.nrCpu}%!!!\n
          Data: ${dsp.dtDatahora}`);
        }
  
        if (formatter(dsp.nrGpu) > 99) {
          return bot.sendMessage(user.idTelegram, `Alerta de consumo de Placa de Vídeo!\n Valor Atual: ${dsp.nrGpu}%!!!\n
          Data: ${dsp.dtDatahora}`);
        }
  
        if (formatter(dsp.nrRam) / formatter(cmp.nmRam) > 85) {
          return bot.sendMessage(user.idTelegram, `Alerta de consumo de RAM!\n Valor Atual: ${dsp.nrRam}!!!\n
          Data: ${dsp.dtDatahora}`);
        }
  
        if (formatter(dsp.nrDisco) > 95) {
          return bot.sendMessage(user.idTelegram, `Alerta de consumo de Disco!\n Valor Atual: ${dsp.nrDisco}%!!!\n
          Data: ${dsp.dtDatahora}`);
        }
      });
    })
  }).catch(err => {
    console.error(err);
  });
}, 60000)

server.listen(port, () => {
  console.log(`Servidor inicializado na porta ${port}`);
});