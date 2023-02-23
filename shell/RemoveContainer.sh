#!/user/bin/bash

userName=$1 # 컨테이너를 실행시킨 유저 이름
userCode=$2 # 컨테이너를 실행시킨 유저 이름 뒤에 들어갈 코드

# 삭제할 도커 컨테이너 이름
containerName=${userName}${userCode}

# 유저 텍스트 파일
txtFile="${userName}.txt"

# 유저들의 컨테이너 코드 정보를 저장할 디렉토리
userDir="Users" 

# 컨테이너 삭제
docker rm ${containerName}

# 공개키 삭제
cd ~/.ssh/
pubKey=`cat ~/.ssh/${containerName}/${containerName}.pub`
if grep -qxF "$pubKey" "authorized_keys"; then
    remove=$(grep -nxF "$pubKey" "authorized_keys" | cut -d':' -f1)
    sed -i "${remove}d" "authorized_keys"
    echo "${containerName} 공개키 삭제"
    rm -rf ~/.ssh/${containerName}
fi

# Users 디렉토리로 이동
cd ~/sh/$userDir || exit

# 사용자 텍스트 파일에서 해당 컨테이너의 코드 삭제
##  유저 코드가 텍스트 파일에 존재하는지 확인
if grep -qxF "$userCode" "$txtFile"; then
    remove=$(grep -nxF "$userCode" "$txtFile" | cut -d':' -f1)
    sed -i "${remove}d" "$txtFile"
    echo "${containerName} 삭제"
    exit 0
fi
