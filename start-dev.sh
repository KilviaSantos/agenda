#!/bin/sh

echo "[JAVA]:"
# verificando se o java está instalado
java -version  

echo "[PSQL]:"
# verificando se o postgres está instalado
psql --version   

echo "[MAVEN]:"
# verificando se o maven está instalado
mvn -version  

echo "[START POSTGRES]:"
# inicializando o serviço de banco de dados do Postgres 
sudo /etc/init.d/postgresql start

echo "[RESTORE DB]:"
# deletando o banco se existir
dropdb agenda
# criando o banco 
createdb agenda
# restaurando o banco de dados com a estrutura e dados antigos
psql -d agenda -f data.sql

echo "[START SPRING-BOOT]:"
# rodando o projeto
mvn spring-boot:run

echo "finished dev start"