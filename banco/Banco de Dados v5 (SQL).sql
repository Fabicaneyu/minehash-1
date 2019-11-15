create table Minerador (
idMinerador int primary key identity(1, 1) not null,
Nome varchar(60),
telegramID char(9) unique,
dataNascimento date,
Telefone varchar(17),
CPF varchar(11),
CNPJ varchar(14),
Email varchar(60),
Senha varchar(20)
);


create table Endereco(
idEndereco int primary key identity(10000, 1) not null,
Numero int,
Rua varchar(45),
Cidade varchar(45),
Bairro varchar(45),
fkMinerador int, foreign key (fkMinerador) references Minerador(idMinerador)
);

create table Computador(
idComp int primary key identity(1000, 1) not null,
GPU varchar(45),
DISCO varchar(45),
RAM varchar(45),
Processador varchar(45),
SO varchar(45),
Hostname varchar(60),
Modelo varchar(60),
Fabricante varchar(60),
fkMinerador int, foreign key (fkMinerador) references Minerador(idMinerador)
);

create table Processo (
idProcesso int primary key identity(1000000, 1) not null,
fkComputador int, foreign key (fkComputador) references Computador(idComp),
PID int ,
NomeProcesso varchar(45),
DataHora datetime 
);


create table Desempenho (
idDesempenho int primary key identity(100000, 1) not null,
fkComputador int, foreign key (fkComputador) references Computador(idComp),
CPUatual decimal(5,2),
RAMatual decimal(5,2),
DISCO decimal(5,2),
GPUatual decimal(5,2),
Temperatura decimal(5,2)
);
