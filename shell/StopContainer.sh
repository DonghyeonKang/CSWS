#!/user/bin/bash

# 실행을 중지할 도커 컨테이너 이름
containerName=$1

docker stop ${containerName}