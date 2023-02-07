import { useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import styled from "styled-components";
import Header from "../../components/Header";

const SecurityGroup = () => {
  const navigate = useNavigate();
  const {instanceId, securityGroupId} = useParams();
  const security = ['보안 그룹 이름', '보안 그룹 ID', '설명(이름, 생성일자)', '소유자', '인바운드 규칙 수', '아웃바운드 규칙 수'];
  const inboundRules = ['이름', '보안 그룹 규칙 ID', 'IP 버전', '유형', '프로토콜', '포트 범위', '소스'];
  const outboundRules = ['이름', '보안 그룹 규칙 ID', 'IP 버전', '유형', '프로토콜', '포트 범위', '소스 '];
  const [tab, setTab] = useState(inboundRules);
    return (
      <>
        <Header/>
        <Content>
          <div>InstanceId : {instanceId}</div>
          <div>SecurityGroupId : {securityGroupId}</div>
          <button onClick={() => navigate(`/dashboard/${instanceId}`)}>뒤로가기</button>
          <div>세부정보</div>
          <DetailContent>
            {security.map((i)=>{return <DetailGrid>{i}</DetailGrid>})}
          </DetailContent>
          <Tabs>
            <Tab onClick={()=> setTab(inboundRules)}>인바운드 규칙</Tab>
            <Tab onClick={()=> setTab(outboundRules)}>아웃바운드 규칙</Tab>
          </Tabs>
          <Stripe>
          {tab[6] === inboundRules[6] ? 
          <div>인바운드 규칙</div>
           : <div>아웃바운드 규칙</div>}
          {tab[6] === inboundRules[6] ? 
          <EditRules onClick={() => navigate('inboundRules')}>인바운드 규칙 편집</EditRules>
           : <EditRules onClick={() => navigate('outboundRules')}>아웃바운드 규칙 편집</EditRules> }
          </Stripe>
          
          <Rules>
            <thead>
              <tr>
              {tab.map((i)=>{return(<RulesHeader>{i}</RulesHeader>)})}
              </tr>
            </thead>
            <tbody>
              <tr>
                <RulesBody>-</RulesBody>
                <RulesBody>-</RulesBody>
                <RulesBody>-</RulesBody>
                <RulesBody>-</RulesBody>
                <RulesBody>-</RulesBody>
                <RulesBody>-</RulesBody>
                <RulesBody>-</RulesBody>
              </tr>
            </tbody>
          </Rules>
          
        </Content>
        
      </>
    );
};

export default SecurityGroup;

const Content = styled.div`
  padding: 0 5%;
  padding-top: 10vh;
`;
const DetailContent = styled.div`
  display: flex;
  flex-wrap: wrap;
  width: 100%;
  margin-bottom: 5%;
`;
const DetailGrid = styled.div`
  width: 29.2%;
  padding: 2%;
  display: flex;
  justify-content: center;
  align-items: center;
  border: 1px solid black;
`;
const Tabs = styled.div`
`;
const Tab = styled.div`
  display: inline-block;
  border: 1px solid black;
`;
const Stripe = styled.div`
  display: flex;
  justify-content: space-between;
`;
const EditRules = styled.button`
`;
const Rules = styled.table`
  display: table;
  width: 100%;
`;
const RulesHeader = styled.th`
  border: 1px solid black;
`;
const RulesBody = styled.td`
  border: 1px solid black;
  text-align: center;
`;