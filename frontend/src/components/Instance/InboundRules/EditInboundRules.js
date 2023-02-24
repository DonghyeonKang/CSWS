import { useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import styled from "styled-components";

const EditInboundRules = () => {
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
          <Title>인바운드 규칙 편집</Title>
            <Container>
                <Rules>
                <tbody>
                <tr>
                    <RulesHeader style={{width:'12vw', minWidth:'150px'}}>보안 그룹 ID</RulesHeader>
                    <RulesHeader style={{width:'12vw', minWidth:'150px'}}>유형</RulesHeader>
                    <RulesHeader style={{width:'12vw', minWidth:'150px'}}>프로토콜</RulesHeader>
                    <RulesHeader style={{width:'8vw', minWidth:'150px'}}>포트 범위</RulesHeader>
                    <RulesHeader style={{width:'12vw', minWidth:'150px'}}>CIDR 블록</RulesHeader>
                    <th> </th>
                </tr>
                {data.map((i)=>{
                    return(
                    <tr>
                      <td style={{width:'12vw', minWidth:'150px'}}>{i.Id}</td>
                      <td style={{width:'12vw', minWidth:'150px'}}>{i.type}</td>
                      <td style={{width:'12vw', minWidth:'150px'}}>{i.protocol}</td>
                      <td style={{width:'8vw', minWidth:'150px'}}>{i.port}</td>
                      <td style={{width:'12vw', minWidth:'150px'}}>{i.CIDR}</td>
                      <DeleteRule onClick={()=>{setData(data.filter((item)=>item.number !== i.number))}}>
                        삭제
                      </DeleteRule>
                    </tr>)})}
                </tbody>
                </Rules>
            </Container>
            <BtnSection>
            <AddRule onClick={()=>addData()}>규칙 추가</AddRule>
            <div>
                <Cancel onClick={() => navigate(`/dashboard/${instanceId}/${securityGroupId}`)}>취소</Cancel>
                <SaveRules onClick={() => navigate(`/dashboard/${instanceId}/${securityGroupId}`)}>인바운드 규칙 저장</SaveRules>
            </div>
          </BtnSection>
        </>
    );
};

export default EditInboundRules;

const Container = styled.div`
display: flex;
width: 1110px;
margin: 3% 0;
box-shadow: 2px 2px #dbdfe0;
background-color: #fafafa;
`;
const Title = styled.div`
  font-size: 20px;
  font-weight: 600;
`;
const Rules = styled.table`
  width: 100%;
  border-spacing: 3vw;
`;

const RulesHeader = styled.th`
  text-align: left;
  margin-right: 5vw;
`;

const DeleteRule = styled.td`
  cursor: pointer;
  background-color: white;
  border: 1px solid black;
  text-align: center;
  width: 50px;
  :hover{
    background-color: #fafafa;
    color: black;
  }
`;

const BtnSection = styled.div`
  display: flex;
  justify-content: space-between;
`;

const AddRule = styled.span`
  cursor: pointer;
  border: 0.5px solid #879596;
  max-height: 20px;
  padding: 2px 12px;
  background-color: white;
  :hover{
    background-color: #fafafa;
    color: black;
  }
`

const SaveRules = styled.span`
  cursor: pointer;
  margin-left: 20px;
  padding: 2px 12px;
  background-color: #ec7211;
  color: white;
  :hover{
    background-color: #eb5f07;
  }
`;

const Cancel = styled.span`
  cursor: pointer;
  padding: 2px 12px;
  :hover{
    background-color: white;
    color: black;
  }
`;