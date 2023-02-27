#!/usr/bin/bash
# ps로 출력한 유저의 모든 컨테이너 상태

PrintStatusforUser(){
    local userName=$1 # 컨테이너를 실행시킨 유저 이름
    docker ps -a --format "table {{.Names}}\t{{.Status}}\t" | grep "$userName[0-99999]"
}

PrintStatusforUser $1