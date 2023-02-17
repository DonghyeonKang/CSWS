import { useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import styled from "styled-components";

const EditOutboundRules = () => {
    const navigate = useNavigate();
    const {instanceId,securityGroupId} = useParams();
    const [number, setNumber] = useState(1);
    const [data,setData] = useState([{
        Id:1,
        type:2,
        protocol:3,
        port:4,
        CIDR:5,
        number:0,
    }]);
    const addData = () => {
        setNumber((prev)=>prev+1);
        setData([...data,{
        Id:1,
        type:2,
        protocol:3,
        port:4,
        CIDR:5,
        number
        }]);
    }
    return (
        <>
            <Container>
                <Rules>
                <tbody>
                <RulesGrid>
                    <td style={{width:'14vw'}}>보안 그룹 ID</td>
                    <td style={{width:'14vw'}}>유형</td>
                    <td style={{width:'14vw'}}>프로토콜</td>
                    <td style={{width:'14vw'}}>포트 범위</td>
                    <td style={{width:'14vw'}}>CIDR 블록</td>
                    <td style={{width:'5vw'}}> </td>
                </RulesGrid>
                {data.map((i)=>{
                    return(
                    <RulesGrid>
                    <td style={{width:'14vw'}}>{i.Id}</td>
                    <td style={{width:'14vw'}}>{i.type}</td>
                    <td style={{width:'14vw'}}>{i.protocol}</td>
                    <td style={{width:'14vw'}}>{i.port}</td>
                    <td style={{width:'14vw'}}>{i.CIDR}</td>
                    <td style={{width:'5vw'}} onClick={()=>{
                        setData(data.filter((item)=>item.number !== i.number))}}>삭제</td>
                    </RulesGrid>)})}
                </tbody>
                </Rules>
            </Container>
            <Btn>
            <button onClick={()=>addData()}>규칙 추가</button>
            <div>
                <button onClick={() => navigate(`/dashboard/${instanceId}/${securityGroupId}`)}>뒤로가기(취소)</button>
                <button onClick={() => navigate(`/dashboard/${instanceId}/${securityGroupId}`)}>아웃바운드 규칙 저장</button>
            </div>
            </Btn>
        </>
    );
};

export default EditOutboundRules;

const Container = styled.div`
  display: flex;
  width: 100%;
`;

const Rules = styled.table`
  width: 100%;  
`;

const RulesGrid  = styled.tr`
  display: flex;
  flex-wrap: nowrap;
  justify-content: space-between;
  margin: 4vh 0;
`;

const Btn = styled.div`
  display: flex;
  justify-content: space-between;
`;