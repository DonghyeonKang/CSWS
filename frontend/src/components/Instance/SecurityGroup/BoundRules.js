import { useState } from "react";
import { useNavigate } from "react-router-dom";
import styled from "styled-components";

const BoundRules = () => {
  const navigate = useNavigate();
  const [tab, setTab] = useState('inboundRules');
    return (
        <>
            <Tabs>
                <Tab onClick={()=> setTab('inboundRules')}>인바운드 규칙</Tab>
                <Tab onClick={()=> setTab('outboundRules')}>아웃바운드 규칙</Tab>
            </Tabs>
            
            <Stripe>
            {tab === 'inboundRules'? 
            <div>인바운드 규칙</div>
            : <div>아웃바운드 규칙</div>}
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
        </>
    );
};

export default BoundRules;

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