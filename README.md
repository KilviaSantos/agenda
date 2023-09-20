# agenda
Atividade 3 PCC Algoritmos e Programaçao UECE

EQUIPE (A): Abraão Alves
		        Fernanda Maciel
		        Kilvia Santos
		        Neidimar Rocha

DESCRIÇÃO DO PROGRAMA: O programa trata-se uma agenda de contatos em que permite ao usuário guardar, consultar, modificar e deletar as informações de seus contatos, como nome, endereço, telefone e e-mail. O programa usa a linguagem Java e um banco de dados para armazenar os dados dos contatos. O programa possui um menu que demonstra as opções que o usuário pode escolher: incluir um novo contato, consultar um contato existente, modificar as informações de um contato, deletar um contato ou sair do programa. O programa lê os dados que o usuário digita pelo teclado e faz as operações no banco de dados. O programa também mostra mensagens para confirmar ou avisar sobre o resultado das operações. 


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
