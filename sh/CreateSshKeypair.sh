#!/usr/bin/bash

# 방식
## .ssh 폴더에 컨테이너마다 디렉토리를 만들어서 키페어를 저장
## 이후 개인키를 로컬(사용자)로 보냄
## 공개키를 csws authorized_keys에 추가
## 공개키를 해당 컨테이너 authorized_keys에 복사
## 사용자는 vscode ssh config에 등록 후 연결
## mac 사용자는 권한 주의

CreateSshKeyPair(){

    # 인수가 잘 들어왔는지 확인
    if [ $# -lt 1 ]; then
        echo "3" #인수가 부족합니다.
        exit 1
    fi

    # 키페어로 들어갈 컨테이너 이름
    local containerName=$1

    mkdir ~/.ssh/${containerName}

    ssh-keygen -t rsa -N "" -f ~/.ssh/${containerName}/${containerName}

    # 사용자는 개인키를 다운받음

    # 공개키를 authorized_keys에 입력
    cat ~/.ssh/${containerName}/${containerName}.pub >> ~/.ssh/authorized_keys
    docker cp ~/.ssh/${containerName}/${containerName}.pub ${containerName}:root/.ssh/authorized_keys
}
CreateSshKeyPair $1 && echo "99"