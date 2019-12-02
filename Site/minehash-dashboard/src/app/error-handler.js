class ErrorHandler {
  constructor(arg) {
    if (typeof arg === 'number') {
      pageError(arg);
    } else if (typeof arg === 'string') {
      serverError(arg);
    } else {
      return console.error('Argumento inválido');
    }
  }

  async pageError(arg) {
    const res = {
      t4: [
        {success: false, error: 400, message: 'Requisição Inválida.'},
        {success: false, error: 401, message: 'Acesso Negado.'},
        {success: false, error: 404, message: 'Informação não encontrada'}
      ],
      t5: [
        {success: false, error: 500, message: 'Erro de Servidor Interno.'},
        {success: false, error: 501, message: 'Método não implementado.'},
        {success: false, error: 503, message: 'Serviço Indisponível'}
      ]
    }

    let result;

    new Promise((resolve, reject) => {
      result = res.t4.find(e => e.error === arg) || res.t5.find(e => e.error === arg);
      if (typeof result !== 'undefined') {
        resolve();
      } else {
        reject();
      }
    }).then(() => result)
    .catch(err => err);
  }

  serverError(arg, err) {
    return console.error(`Erro em ${arg}`, err);
  }
}

module.exports = new ErrorHandler();