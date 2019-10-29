FROM mysql:latest

MAINTAINER "leo-bin" <1114011786@qq.com>

# mysql的工作位置
ENV WORK_PATH /usr/local/

# 定义会被容器自动执行的目录
ENV AUTO_RUN_DIR /docker-entrypoint-initdb.d

# 初始化数据库的SQL文件
ENV FILE_0 docker_ssm_schema.sql

# 执行SQL
ENV INSTALL_DATA_SHELL docker-entrypoint.sh

# 把要执行的sql文件放到MySQL的工作目录下
COPY ./$FILE_0 $WORK_PATH/

# 把要执行的shell文件放到/docker-entrypoint-initdb.d/目录下，容器会自动执行这个shell
COPY ./$INSTALL_DATA_SHELL $AUTO_RUN_DIR/

# 给执行文件增加可执行权限
RUN chmod a+x $AUTO_RUN_DIR/$INSTALL_DATA_SHELL