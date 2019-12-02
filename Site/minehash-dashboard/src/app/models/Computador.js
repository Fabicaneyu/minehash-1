'use strict';

module.exports = (sequelize, DataTypes) => {
  const Computador = sequelize.define('Computador', {
    idComputador: {
      type: DataTypes.INTEGER,
      primaryKey: true,
      field: 'id_computador'
    },
    fkUsuario: {
      type: DataTypes.STRING,
      field: 'fk_usuario'
    },
    nmGpu: {
      type: DataTypes.STRING,
      field: 'nm_gpu'
    },
    nmDisco: {
      type: DataTypes.STRING,
      field: 'nm_disco'
    },
    nmRam: {
      type: DataTypes.STRING,
      field: 'nm_ram'
    },
    nmProcessador: {
      type: DataTypes.STRING,
      field: 'nm_processador'
    },
    nmSo: {
      type: DataTypes.STRING,
      field: 'nm_so'
    },
    nmHostname: {
      type: DataTypes.STRING,
      field: 'nm_hostname'
    },
    nmModelo: {
      type: DataTypes.STRING,
      field: 'nm_modelo'
    },
    nmFabricante: {
      type: DataTypes.STRING,
      field: 'nm_fabricante'
    }
  }, { 
    tableName: 'tb_computador',
    associate: (models) => {
      Computador.belongsTo(models.Usuario, {
        foreignKey: 'fk_usuario'
      });
      
      Computador.hasMany(models.Processo, {
        foreignKey: 'fk_computador'
      });
      
      Computador.hasMany(models.Desempenho, {
        foreignKey: 'fk_computador'
      });
    }
  });

  return Computador;
};
