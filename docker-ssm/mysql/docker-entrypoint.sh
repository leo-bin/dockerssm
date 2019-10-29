#!/bin/bash
#-u后面是数据库用户名 -p后面跟的是密码，如果数据库密码不是root记得修改这里,而且，-p后面一定要紧跟你的密码，不要有空格！！
mysql -uroot -proot <<EOF
source /usr/local/docker_ssm_schema.sql;