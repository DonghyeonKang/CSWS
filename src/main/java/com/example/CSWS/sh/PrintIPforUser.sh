#!/usr/bin/bash
# ps로 출력한 유저의 모든 컨테이너 IP

PrintIPforUser(){
    local userName=$1 # 컨테이너를 실행시킨 유저 이름
    docker inspect -f "{{ .Name }} -> {{ .NetworkSettings.IPAddress }}" $(docker ps -qa) | grep "$userName[0-99999]"
}

PrintIPforUser $1