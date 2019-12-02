class ErrorController {
  constructor() {
    this.result = {
      success: false,
      message: "Método inválido."
    }
  }

  get(req, res) {
    return res.status(400).json(this.result);
  }

  api(req, res) {
    get(req, res);
  }

  index(req, res) {
    get(req, res);
  }
}

module.exports = new ErrorController();
