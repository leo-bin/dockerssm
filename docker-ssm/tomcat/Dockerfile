# 直接从docker提供的远程镜像仓库中拉取最新的tomcat组件
FROM tomcat

# 本镜像的制作者的信息
MAINTAINER "leo-bin" <1114011786@qq.com>

# 把该容器的时区设置为北京时区
ENV TZ=Asia/Shanghai

# 把当前文件目录下的docker-ssm.war移动到容器中tomcat自动启动的目录下
COPY ./docker-ssm.war /usr/local/tomcat/webapps/