#!/bin/sh

echo "\n[JAVA]:"
java -version  

echo "\n[PSQL]:"
psql --version   

echo "\n[MAVEN]:"
mvn -version  

echo "\n[START POSTGRES]:"
sudo /etc/init.d/postgresql start

echo "\n[RESTORE DB]:"

dropdb agenda
createdb agenda
## psql -d agenda -f data.sql

echo "\n[START SPRING AND VITE]:"

mvn spring-boot:run

echo "finished dev start"