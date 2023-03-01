#Ubuntu Docker file with Ssh 
#VERSION 0.0.1

#Base Image
FROM ubuntu:latest

#Maintainer Info.
LABEL maintainer="juxtap.se@gmail.com"

#Update APT repository & Install OpenSSH
RUN apt-get update \
    && apt-get install -y openssh-server

#set password
RUN echo 'root:root' |chpasswd

#Allow Root login
RUN sed -ri 's/^#?PermitRootLogin\s+.*/PermitRootLogin yes/' /etc/ssh/sshd_config
RUN sed -ri 's/UsePAM yes/#UsePAM yes/g' /etc/ssh/sshd_config

RUN mkdir /root/.ssh

RUN apt-get clean && \
    rm -rf /var/lib/apt/lists/* /tmp/* /var/tmp/*

#To start service at runtime
CMD ["/usr/sbin/sshd", "-D"]