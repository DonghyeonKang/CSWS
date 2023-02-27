#!/user/bin/bash

StopContainer()
{
    # 실행을 중지할 도커 컨테이너 이름
    local containerName=$1

    docker stop ${containerName}
}

StopContainer $1