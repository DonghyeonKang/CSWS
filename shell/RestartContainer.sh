#!/user/bin/bash

RestartContaienr()
{
    # 재시작할 도커 컨테이너 이름
    local containerName=$1

    docker restart ${containerName}
}

RestartContaienr $1