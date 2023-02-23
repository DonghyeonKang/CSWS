#!/user/bin/bash

# 재시작할 도커 컨테이너 이름
containerName=$1

docker restart ${containerName}