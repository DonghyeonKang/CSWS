#!/user/bin/bash

RemoveContainer(){

    # 인수가 잘 들어왔는지 확인
    if [ $# -lt 2 ]; then
        echo "3" #인수가 부족합니다.
        exit 1
    fi

    local userName=$1 # 컨테이너를 실행시킨 유저 이름
    local userCode=$2 # 컨테이너를 실행시킨 유저 이름 뒤에 들어갈 코드

    # 삭제할 도커 컨테이너 이름
    local containerName=${userName}${userCode}

    # 유저 텍스트 파일
    local txtFile="${userName}.txt"

    # 유저들의 컨테이너 코드 정보를 저장할 디렉토리
    local userDir="Users" 

    # 컨테이너가 존재하는지 확인하고 삭제
    if [ -z `docker ps -qa -f name=$conianerName` ]; then
        echo "8" ; exit 1
    else
        docker rm -f ${containerName}
    fi

   # Users 디렉토리로 이동
    cd ~/sh/$userDir || exit 1

    # 사용자 텍스트 파일에서 해당 컨테이너의 코드 삭제
    ##  유저 코드가 텍스트 파일에 존재하는지 확인
    if [ grep -qxF "$userCode" "$txtFile" ]; then
        local remove=$(grep -nxF "$userCode" "$txtFile" | cut -d':' -f1)
        sed -i "${remove}d" "$txtFile" 
        echo "${containerName} 삭제"
    else
        echo "5" ; exit 1
    fi
####------------------여기까지로 인해 공개키가 없어도 컨테이너 삭제됨-------------------------------###

    # 공개키 존재 확인
    cd ~/.ssh/
    if [ -e ~/.ssh/${containerName}/${containerName}.pub ]; then
        local pubKey=`cat ~/.ssh/${containerName}/${containerName}.pub`
    else
        echo "9"; exit 1
    
    fi

    # 공개키 삭제
    if  grep -qxF "$pubKey" "authorized_keys" ;then
        local remove=$(grep -nxF "$pubKey" "authorized_keys" | cut -d':' -f1)
        sed -i "${remove}d" "authorized_keys"
        echo "${containerName} 공개키 삭제"
        rm -rf ~/.ssh/${containerName}
    else 
        echo "5"; exit 1
    fi
    
}

RemoveContainer $1 $2 && echo "99"