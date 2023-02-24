import { useState } from "react";
import { useNavigate } from "react-router-dom";
import styled from "styled-components";

const BoundRules = () => {
  const navigate = useNavigate();
  const [tab, setTab] = useState('inboundRules');
    return (
        <>
            <Tabs>
              {tab === 'inboundRules' ? 
              <SelectedTab onClick={()=> setTab('inboundRules')}>인바운드 규칙</SelectedTab> : 
              <Tab onClick={()=> setTab('inboundRules')}>인바운드 규칙</Tab>}
              {tab === 'outboundRules' ? 
              <SelectedTab onClick={()=> setTab('outboundRules')}>아웃바운드 규칙</SelectedTab> : 
              <Tab onClick={()=> setTab('outboundRules')}>아웃바운드 규칙</Tab>}
                
            </Tabs>
            <Box>
              <Stripe>
                {tab === 'inboundRules'? 
                <Title>인바운드 규칙</Title>
                : <Title>아웃바운드 규칙</Title>}
                {tab === 'inboundRules' ? 
                <EditRules onClick={() => navigate('inboundRules')}>인바운드 규칙 편집</EditRules>
                : <EditRules onClick={() => navigate('outboundRules')}>아웃바운드 규칙 편집</EditRules> }
              </Stripe>
              
              <Rules> 
                <thead>
                  <tr>
                    <RulesHeader style={{minWidth:'60px'}}>이름</RulesHeader>
                    <RulesHeader style={{minWidth:'160px'}}>보안 그룹 규칙 ID</RulesHeader>
                    <RulesHeader style={{minWidth:'80px'}}>IP 버전</RulesHeader>
                    <RulesHeader style={{minWidth:'60px'}}>유형</RulesHeader>
                    <RulesHeader style={{minWidth:'120px'}}>프로토콜</RulesHeader>
                    <RulesHeader style={{minWidth:'120px'}}>포트범위</RulesHeader>
                    <RulesHeader style={{minWidth:'60px'}}>소스</RulesHeader>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <RulesBody style={{minWidth:'60px'}}>-</RulesBody>
                    <RulesBody style={{minWidth:'160px'}}>-</RulesBody>
                    <RulesBody style={{minWidth:'80px'}}>-</RulesBody>
                    <RulesBody style={{minWidth:'60px'}}>-</RulesBody>
                    <RulesBody style={{minWidth:'120px'}}>-</RulesBody>
                    <RulesBody style={{minWidth:'120px'}}>-</RulesBody>
                    <RulesBody style={{minWidth:'60px'}}>-</RulesBody>
                  </tr>
                </tbody>
              </Rules>
            </Box>
            
        </>
    );
};

export default BoundRules;

const Tabs = styled.div`
`;
const Tab = styled.div`
cursor: pointer;
display: inline-block;
padding: 5px;
border: 1px solid #eaeded;
background-color: #fafafa;
:hover{
  color: #0073bb;
}
`;
const SelectedTab = styled(Tab)`
  color: #0073bb;
  border-bottom: 2px solid #0073bb;
`;

const Box = styled.div`
  border: 1px solid #eaeded;
  padding: 1%;
  min-width: 750px;
  background-color: white;
`;
const Stripe = styled.div`
  display: flex;
  justify-content: space-between;
  margin: 2% 0;
`;
const Title = styled.div`
  font-size: 20px;
  font-weight: 600;
`;
const EditRules = styled.div`
  cursor: pointer;
  border: 0.5px solid #879596;
  padding: 2px 12px;
  font-weight: 600;
  background-color: white;
  :hover{
    background-color: #fafafa;
    color: black;
  }
`;
const Rules = styled.table`
  width: 100%;
  border-spacing: 0;
`;
const RulesHeader = styled.th`
  background-color: #fafafa;
  text-align: left;
  padding: 3px 0;
  padding-left: 10px;
  border: 1px solid #eaeded;
`;
const RulesBody = styled.td`
  text-align: left;
  padding: 5px 0;
  padding-left: 10px;
`;