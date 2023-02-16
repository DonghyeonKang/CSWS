import { useState } from "react";
import { useNavigate } from "react-router-dom";
import styled from "styled-components";

const TabsContent = () => {
    const navigate = useNavigate();
    const [list,setList] = useState('detail'); //인스턴스 상세 탭
    const [domain,setDomain] = useState();
    return (
        <>
            <DetailTap onClick={()=>setList('detail')}>세부정보</DetailTap>
            <DetailTap onClick={()=>setList('security')}>보안</DetailTap>
            <DetailTap onClick={()=>setList('networking')}>네트워킹</DetailTap>
            <DetailTap onClick={()=>setList('domain')}>도메인 적용</DetailTap>
            <DetailContent>
                {(list === 'detail') ? 
                <>
                <DetailGrid>플랫폼(OS)</DetailGrid>
                <DetailGrid>시작 시간</DetailGrid>
                <DetailGrid>키 페어 이름</DetailGrid>
                <DetailGrid>소유자</DetailGrid>
                </>
                : (list === 'security') ? 
                <>
                <DetailGrid>소유자 ID</DetailGrid>
                <DetailGrid>시작 시간</DetailGrid>
                <DetailGrid onClick={() => navigate(`${Date.now()}`)}>보안 그룹 ID</DetailGrid>
                <DetailGrid>인바운드 규칙 목록</DetailGrid>
                <DetailGrid>아웃바운드 규칙 목록</DetailGrid>
                </>
                : (list === 'networking') ? 
                <>
                <DetailGrid>퍼블릭 IPv4 주소</DetailGrid>
                <DetailGrid>프라이빗 IPv4 주소</DetailGrid>
                <DetailGrid>퍼블릭 IPv4 DNS</DetailGrid>
                <DetailGrid>프라이빗 IP DNS 이름</DetailGrid>
                <DetailGrid>네트워크 인터페이스</DetailGrid>
                </>
                : <DetailGrid>
                <input placeholder="도메인 입력" onChange={(i)=>setDomain(i)}/>
                <button onClick={()=>console.log(domain.target.value)}>도메인 적용</button>
                </DetailGrid>}
            </DetailContent>
        </>
    );
};

export default TabsContent;

const DetailTap = styled.div`
  display: inline-block;
  border: 1px black solid;
  padding: 5px;
`;

const DetailContent = styled.div`
  display: flex;
  flex-wrap: wrap;
  width: 100%;
`;

const DetailGrid = styled.div`
  width: 29.2%;
  padding: 2%;
  display: flex;
  justify-content: center;
  align-items: center;
  border: 1px solid black;
`;