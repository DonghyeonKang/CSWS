#!/user/bin/bash

# 실행을 시작할 도커 컨테이너 이름
containerName=$1

docker start ${containerName}