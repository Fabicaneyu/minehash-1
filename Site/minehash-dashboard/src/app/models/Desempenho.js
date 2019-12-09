'use strict';

module.exports = (sequelize, DataTypes) => {
  const Desempenho = sequelize.define('Desempenho', {
    idDesempenho: {
      type: DataTypes.INTEGER,
      primaryKey: true,
      field: 'id_desempenho'
    },
    fkComputador: {
      type: DataTypes.INTEGER,
      field: 'fk_computador'
    },
    nrCpu: {
      type: DataTypes.DECIMAL,
      field: 'nr_cpu'
    },
    nrRam: {
      type: DataTypes.DECIMAL,
      field: 'nr_ram'
    },
    nrDisco: {
      type: DataTypes.DATE,
      field: 'nr_disco'
    },
    nrGpu: {
      type: DataTypes.DATE,
      field: 'nr_gpu'
    },
    nrTemperaturaCpu: {
      type: DataTypes.DECIMAL,
      field: 'nr_temperatura_cpu'
    },
    nrTemperaturaGpu: {
      type: DataTypes.DECIMAL,
      field: 'nr_temperatura_gpu'
    },
    dtDatahora: {
      type: DataTypes.DATE,
      field: 'dt_datahora'
    }
  }, { 
    tableName: 'tb_desempenho',
    associate: (models) => {
      Desempenho.belongsTo(models.Computador, {
        foreignKey: 'fk_computador'
      });
    }
  });

  return Desempenho;
};
