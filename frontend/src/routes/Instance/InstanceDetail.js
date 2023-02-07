import { useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import styled from "styled-components";
import Header from "../../components/Header";

const InstanceDetail = () => {
  const navigate = useNavigate();
  const {instanceId} = useParams();//임시 인스턴스 ID
  const description = ['인스턴스 ID', '퍼블릭 IPv4 주소', '인스턴스 상태', '퍼블릭 IPv4 DNS', '자동 할당 IP 주소(퍼블릭 IP)'];
  const detail = ['플랫폼(OS)', '시작 시간', '키 페어 이름', '소유자'];
  const security = ['소유자 ID', '시작 시간', '보안 그룹 ID', '인바운드 규칙 목록', '아웃바운드 규칙 목록'];
  const networking = ['퍼블릭 IPv4 주소', '프라이빗 IPv4 주소', '퍼블릭 IPv4 DNS', '프라이빗 IP DNS 이름', '네트워크 인터페이스'];
  const [list,setList] = useState(detail);
  const [domain,setDomain] = useState();
    return (
      <>
        <Header/>
        <Content>
          <div>InstanceDetail {instanceId}</div>
          <button onClick={() => navigate('/dashboard')}>뒤로가기</button>
          <div>인스턴스 요약</div>
          <DescriptionContent>
            {description.map((i)=>{return <DescriptionGrid>{i}</DescriptionGrid>})}
          </DescriptionContent>
          

          <DetailTap onClick={()=>setList(detail)}>세부정보</DetailTap>
          <DetailTap onClick={()=>setList(security)}>보안</DetailTap>
          <DetailTap onClick={()=>setList(networking)}>네트워킹</DetailTap>
          <DetailTap>도메인 적용</DetailTap>
          <DetailContent>{list.map((i)=>{return <DetailGrid>{i}</DetailGrid>})}</DetailContent>

          <div>도메인 적용 탭에 넣기</div>
          <input placeholder="도메인 입력" onChange={(i)=>setDomain(i)}/>
          <button onClick={()=>console.log(domain)}>도메인 적용</button>

          <div>보안 탭에 보안 그룹 ID에 a태그</div>
          <button onClick={() => navigate(`${Date.now()}`)}>보안 그룹</button>
        </Content>
      </>
    );
};

export default InstanceDetail;
/*"세부 정보 출력: 플랫폼(OS) / 시작 시간 / 키 페어 이름 / 소유자"
    "보안 정보 출력: - 소유자 ID / 시작 시간 / 보안 그룹 ID / 인바운드 및 아웃바운드 규칙 목록"
    "네트워킹 정보 출력: 퍼블릭 IPv4 주소 / 프라이빗 IPv4 주소 / 퍼블릭 IPv4 DNS / 프라이빗 IP DNS 이름 / 네트워크 인터페이스"*/
const Content = styled.div`
  padding: 0 5%;
  padding-top: 10vh;
`;

const DescriptionContent = styled.div`
  display: flex;
  flex-wrap: wrap;
  width: 100%;
  margin-top: 3%;
  margin-bottom: 5%;
`;

const DescriptionGrid = styled.div`
  width: 29.2%;
  padding: 2%;
  display: flex;
  justify-content: center;
  align-items: center;
  border: 1px solid black;
`

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