create database minehash2;
use minehash2;

create table Minerador (
idMinerador int primary key auto_increment not null,
Nome varchar(60),
dataNascimento date,
telefone varchar(17),
cpf varchar(11),
email varchar(60),
senha varchar(20)
) auto_increment = 0001;

create table Endereco(
idEndereco int primary key auto_increment not null,
Numero int,
Rua varchar(45),
Cidade varchar(45),
Bairro varchar(45),
fkMinerador int, foreign key (fkMinerador) references Minerador(idMinerador)
)auto_increment = 10000;

create table Computador(
idComp int primary key auto_increment not null,
hostname varchar(60),
fabricante varchar(60),
modelo varchar(60),
processador varchar(45),
sistemaOperacional varchar(45),
memoriaRam varchar(45),
gpu varchar(45),
disco varchar(45),
fkMinerador int, foreign key (fkMinerador) references Minerador(idMinerador)	
) auto_increment = 1000;	

create table Processo (
idProcesso int primary key auto_increment not null,
usuario varchar(45),
nomeProcesso varchar(45),
pid int ,
statusProcesso varchar(45),
prioridadeProcesso int,
cpuPercentual decimal (5,2),
fkComputador int, foreign key (fkComputador) references Computador(idComp)
)auto_increment = 1000000;

create table Desempenho (
idDesempenho int primary key auto_increment not null,
fkComputador int, foreign key (fkComputador) references Computador(idComp),
CPUatual decimal(5,2),
RAMatual decimal(5,2),
DISCO decimal(5,2),
GPUatual decimal(5,2),
Temperatura decimal(5,2)
)auto_increment = 100000;

insert into Minerador (Nome,dataNascimento,Telefone,CPF,Email,Senha) values
('Gabriel Sutto Tinquim','1999-02-05','1195437387','48280129820','gabrieltinquim@gmail.com','Titica123');

insert into Minerador (Nome,dataNascimento,Telefone,CPF,Email,Senha) values
('Leonardo Ítalo','2001-09-22','11959358729','51724941895','it-gimenes@hotmail.com','teste123');

insert into Minerador (Nome,dataNascimento,Telefone,CPF,Email,Senha) values
('Gabriel Sutto Tinquim','1999-02-05','1195437387','48280129820','teste@teste','teste');

select * from Minerador where email = 'gabrieltinquim@gmail.com' and senha = 'teste';	
select idMinerador from Minerador where email = 'gabrieltinquim@gmail.com' and senha = 'teste';
delete from Minerador where idMinerador = 2;

update Minerador set senha = 'teste' where idMinerador = 1;

insert into Endereco values
(261,'Paulo di favari','São Bernardo','Rudge Ramos',1);

insert into Computador values 
(null,"teste","teste","teste","teste","teste","teste","teste","teste",1);

insert into Processo values
(null,1000,112,"Xalala",null);

insert into Desempenho values
(null,1000,99.0,99.0,99.0,99.0,99.0);

/*select juntando as informações do cliente*/
select * from Minerador as m 
	join Endereco as e on m.idMinerador = e.fkMinerador 
	join Computador as c on c.fkMinerador = m.idMinerador;

/* select juntando as informações do computador do cliente*/
select * from Computador as c
	join Processo as p on c.idComp = p.fkComputador
    join Desempenho as d on c.idComp = d.fkComputador; 

select * from Minerador as m 
	join Computador as c on c.fkMinerador = m.idMinerador;
    
    select * from Minerador as m 
		join Computador as c on c.fkMinerador = m.idMinerador
        join Processo as p on c.idComp = p.fkComputador;
    
    select * from Minerador;





