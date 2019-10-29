CREATE DATABASE `docker_ssm` CHARACTER SET 'utf8mb4';

use docker_ssm;

create table docker_ssm_test
(
  id   int auto_increment
    primary key,
  name varchar(10) null
) DEFAULT CHARSET = utf8mb4;