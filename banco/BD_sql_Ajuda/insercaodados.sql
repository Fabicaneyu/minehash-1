select * from Minerador; 
select * from Endereco; 
select * from Computador; 
select * from Processo; 
select * from Desempenho; 

--Inserir dados
-- Tabela Minerador 


INSERT INTO Minerador (Nome, telegramID, dataNascimento, Telefone, CPF, CNPJ, Email, Senha) 
VALUES ('Fabiola Canedo Yugar', '259250249', '1997-03-10', '5511923456789', '23968294022', '12268205825136', 'fabicaneyu@minehash.com.br', '#Gf23968294022'),
       ('Guilherme Figueiredo de Souza', '259260167', '1982-08-26', '5511998765432', '82970268254', '17929672852516', 'gui.souza@gmail.com', 'abc123def456'),
       ('Margarita Figueiredo de Souza', '259260184', '1981-08-25', '5511998765878', '82970258254', '17929672852254', 'margui.souza@gmail.com', 'abc123def425');
 

select * from Minerador; 

-- Tabela Endereco

INSERT INTO Endereco (Numero,Rua,Cidade,Bairro,fkMinerador)
VALUES(54,'Beleza Pura','São Paulo','Itaquera',17),
      (595,'Hadock Lobo','São Paulo','Cerqueira Cesar',18),
      (65,'Alameda Cleveland','São Paulo','Santa Cecília',19);

select * from Endereco; 


-- Tabela Computador
INSERT INTO Computador(GPU, DISCO, RAM,Processador,SO,Hostname,Modelo,Fabricante,fkMinerador)
VALUES (78,88,98,'Intel','Windows','HP 360','Beats','HP',17);

select * from Computador; 


-- Tabela Processo
INSERT INTO Processo (fkComputador,PID,NomeProcesso,DataHora)
VALUES (1003,10,'Mineração','2019-11-16 19:10:00')


select * from Processo; 

-- Tabela Desempenho
INSERT INTO Desempenho(fkComputador,CPUatual,RAMatual,DISCO,GPUatual,Temperatura)
VALUES(1003,70,80,90,98,77),
	  (1004,70,80,90,98,77);


select * from Desempenho; 


