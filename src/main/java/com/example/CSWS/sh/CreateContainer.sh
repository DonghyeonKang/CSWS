#!/usr/bin/bash

CreateContainer(){
local hPort=$1 # 호스트 포트
local cPort=$2 # 컨테이너 포트
local userName=$3 # 컨테이너를 실행시키는 유저 이름
local userCode=$4 # 컨테이너를 실행시키는 유저 이름 뒤에 들어갈 코드
local storageSize=$5
local imageName=$6 # 실행시킬 컨테이너의 이미지


local userDir="Users" # 유저들의 컨테이너 코드 정보를 저장할 디렉토리
local txtFile="${userName}.txt"

# 인수가 잘 들어왔는지 확인
if [ $# -lt 6 ]; then
    echo "인수가 부족합니다."
    exit 1
fi

# Users 디렉토리가 존재하지 않으면 생성
if [ ! -d ${userDir} ]; then
    mkdir ${userDir}
fi

# 도커 컨테이너 실행
docker run -it --privileged -d -p $hPort:$cPort --name ${userName}${userCode} --storage-opt size=$storageSize $imageName /sbin/init || exit
# docker run -it -p $hPort:$cPort --name ${userName}${userCode} $imageName || exit

# Users 디렉토리로 이동
cd $userDir || exit

# 해당하는 유저의 텍스트 파일이 존재하지 않으면 생성
if [ ! -e "$txtFile" ]; then
    touch "$txtFile"
fi

# 유저 코드가 텍스트 파일에 존재하는지 확인
if grep -qxF "$userCode" "$txtFile"; then
    echo "이미 존재하는 유저 코드입니다."
    exit 0
else
    echo "${userCode}" >> "$txtFile"
fi

}

CreateContainer $1 $2 $3 $4 $5 $6