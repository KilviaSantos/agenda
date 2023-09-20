# agenda
Atividade 3 PCC Algoritmos e Programaçao UECE


## Comandos SQL Utilizados

Incluir: "<

  CREATE TABLE contato (
    id INT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    endereco VARCHAR(50) NOT NULL,
    email VARCHAR(50) UNIQUE,
    telefone VARCHAR(15)
  );

>"

Alterar: "<

  UPDATE contatos
  SET nome = 'Maria', email = 'maria@email.com'
  WHERE id = 10;

>"

Pesquisar: "<

  SELECT * FROM contatos WHERE nome = 'Maria';

>"

Deletar: "<

  DELETE FROM contatos WHERE id = 10;

>"


### Participantes
