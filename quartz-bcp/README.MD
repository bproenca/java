## Create Database
```
docker run --name mysql-bcp -e MYSQL_ROOT_PASSWORD=admin -d mysql

mysql -h <container-ip> -u root -p
CREATE USER 'bcp' IDENTIFIED BY 'bcp';
GRANT ALL PRIVILEGES ON *.* TO 'bcp';
exit

mysql -h <container-ip> -u bcp -p
select host, user from mysql.user;
create database quartz_demo_db;
show databases;
use quartz_demo_db;
show tables;


```