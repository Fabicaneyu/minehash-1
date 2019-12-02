const fs = require('fs');
const path = require('path');
const Sequelize = require('sequelize');
const cfg = require('../../config/config.js');

const db = {};
const sequelize = new Sequelize(cfg.database, cfg.username, cfg.password, {
  host: cfg.host,
  dialect: cfg.dialect,
  dialectOptions: {
    options: { encrypt: true }
  },
  pool: {
    max: 5,
    min: 0,
    idle: 10000
  },
  define: {
    underscoredAll: true,
    timestamps: false
  }
});

fs.readdirSync(__dirname)
.filter(file => (file.indexOf('.') !== 0) && (file !== path.basename(__filename)) && (file.slice(-3) === '.js'))
.forEach((file) => {
  const model = sequelize.import(path.join(__dirname, file));
  db[model.name] = model;
});

Object.keys(db).forEach((modelName) => {
  if (db[modelName].associate) {
    db[modelName].associate(db);
  }
});

db.sequelize = sequelize;
db.Sequelize = Sequelize;

module.exports = db;
