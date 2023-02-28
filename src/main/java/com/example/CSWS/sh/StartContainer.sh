#!/user/bin/bash

StartContainer(){
    # 실행을 시작할 도커 컨테이너 이름
    local containerName=$1

    docker start ${containerName}
}

StartContainer $1