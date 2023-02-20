import { useState } from "react";
import { useNavigate } from "react-router-dom";
import styled from "styled-components";

const TabsContent = () => {
  const navigate = useNavigate();
  const [list,setList] = useState('detail'); //인스턴스 상세 탭
  const [tab, setTab] = useState('detail'); //선택된 탭 강조 표시
  const [domain,setDomain] = useState();
    return (
        <>
          {tab === 'detail' ? 
          <SelectedTab onClick={()=>setList('detail')}>세부정보</SelectedTab> : 
          <DetailTab onClick={()=>{
            setList('detail');
            setTab('detail');
            }}>세부정보</DetailTab>}
          {tab === 'security' ? 
          <SelectedTab onClick={()=>setList('security')}>보안</SelectedTab> : 
          <DetailTab onClick={()=>{
            setList('security');
            setTab('security');
            }}>보안</DetailTab>}
          {tab === 'networking' ? 
          <SelectedTab onClick={()=>setList('networking')}>네트워킹</SelectedTab> : 
          <DetailTab onClick={()=>{
            setList('networking');
            setTab('networking');
            }}>네트워킹</DetailTab>}
          {tab === 'domain' ? 
          <SelectedTab onClick={()=>setList('domain')}>도메인 적용</SelectedTab> : 
          <DetailTab onClick={()=>{
            setList('domain');
            setTab('domain');
            }}>도메인 적용</DetailTab>}
            
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
                <DetailId onClick={() => navigate(`${Date.now()}`)}>보안 그룹 ID</DetailId>
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

const DetailTab = styled.div`
  cursor: pointer;
  display: inline-block;
  padding: 5px;
  border: 1px solid #eaeded;
  background-color: #fafafa;
  :hover{
    color: #0073bb;
  }
`;
const SelectedTab = styled(DetailTab)`
  border-bottom: 2px solid  #0073bb;
  color:  #0073bb;
`;

const DetailContent = styled.div`
  display: flex;
  flex-wrap: wrap;
  width: 100%;
`;

const DetailGrid = styled.div`
  width: 315px;
  padding: 2%;
  display: flex;
  justify-content: center;
  align-items: center;
  border: 1px solid #eaeded;
`;

const DetailId = styled(DetailGrid)`
  cursor: pointer;
  color: #0073bb;
  :hover{
    text-decoration: underline;
  }
`;