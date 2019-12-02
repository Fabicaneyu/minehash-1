'use strict';

const bcrypt = require('bcryptjs');

module.exports = (sequelize, DataTypes) => {
  const Usuario = sequelize.define('Usuario', {
    idUsuario: {
      type: DataTypes.INTEGER,
      autoIncrement: true,
      primaryKey: true,
      field: 'id_usuario'
    },
    nmNome: {
      type: DataTypes.STRING,
      allowNull: false,
      field: 'nm_nome'
    },
    idTelegram: {
      type: DataTypes.INTEGER,
      unique: true,
      field: 'id_telegram'
    },
    dtNascimento: {
      type: DataTypes.DATEONLY,
      allowNull: false,
      field: 'dt_nascimento'
    },
    nrTelefone: {
      type: DataTypes.STRING,
      allowNull: false,
      field: 'nr_telefone'
    },
    nrCpf: {
      type: DataTypes.STRING,
      allowNull: false,
      unique: true,
      field: 'nr_cpf',
      validate: {
        max: 99999999999,
        len: [8, 9]
      }
    },
    nmEmail: {
      type: DataTypes.STRING,
      allowNull: false,
      field: 'nm_email',
      validate: {
        isEmail: true
      }
    },
    nmSenha: {
      type: DataTypes.STRING,
      allowNull: false,
      field: 'nm_senha'
    }
  }, {
    tableName: 'tb_usuario',
    instanceMethods: {
      generateHash: pwd => {
        return bcrypt.hash(pwd, bcrypt.genSaltSync(8));
      },
      checkPassword: pwd => {
        return bcrypt.compare(pwd, this.nmSenha);
      },
    },
    associate: (models) => {
      Usuario.hasMany(models.Computador, {
        foreignKey: 'id_computador'
      });
    }
  });

  return Usuario;
};
