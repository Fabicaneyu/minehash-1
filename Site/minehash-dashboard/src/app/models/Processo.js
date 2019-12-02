'use strict';

module.exports = (sequelize, DataTypes) => {
  const Processo = sequelize.define('Processo', {
    idProcesso: {
      type: DataTypes.INTEGER,
      primaryKey: true,
      field: 'id_processo'
    },
    fkComputador: {
      type: DataTypes.INTEGER,
      field: 'fk_computador'
    },
    nrPid: {
      type: DataTypes.INTEGER,
      field: 'nr_pid'
    },
    nmProcesso: {
      type: DataTypes.STRING,
      field: 'nm_processo'
    },
    dtDatahora: {
      type: DataTypes.DATE,
      field: 'dt_datahora'
    }
  }, {
    tableName: 'tb_processo',
    associate: (models) => {
      Processo.belongsTo(models.Computador, {
        foreignKey: 'fk_computador'
      });
    }
  });

  return Processo;
};
