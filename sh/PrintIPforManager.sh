#!/usr/bin/bash
# ps -a로 출력한 모든 컨테이너의 IP

docker inspect -f "{{ .NetworkSettings.IPAddress }}" `docker ps -qa`