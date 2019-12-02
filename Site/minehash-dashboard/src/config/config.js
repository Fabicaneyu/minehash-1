module.exports = {
  dialect: 'mssql',
  host: 'srvminehash.database.windows.net',
  username: 'userminehash',
  password: '#Gfgrupo1',
  database: 'bdminehash',
  options: {
    dialectOptions: {
      encrypt: true
    }
  },
  operatorAliases: false,
  define: {
    timestamps: false,
    paranoid: false,
    underscored: true,
    underscoredAll: true,
    freezeTableName: true
  }
}
