import { useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import styled from "styled-components";
import Header from "../../components/Header";

const OutboundRules = () => {
  const navigate = useNavigate();
  const {instanceId,securityGroupId} = useParams();
  const gridHeader = ['보안 그룹 ID', '유형', '프로토콜', '포트 범위', 'CIDR 블록'];
  const [gridData,setGridData] = useState(['-','-','-','-','-']);//객체로 만드는게 생성 삭제가 쉬울듯
  const [deleteBtn,setDeleteBtn] = useState(['삭제']);
  const addData = () => {
    setGridData([...gridData,'-','-','-','-','-']);
    setDeleteBtn([...deleteBtn,'삭제']);
  }
  let number = 1;
    return (
      <>
        <Header/>
        <Content>
          <Container>
            <Rules>
              <tbody>
              <RulesGrid>
                {gridHeader.map((i)=>{return (<td key={i} style={{width:'16vw'}}>{i}</td>)})}
              </RulesGrid>
              <RulesGrid> 
                {gridData.map((i)=>{
                  number++;
                  return (<td key={number} style={{width:'16vw',margin:'1vh 0'}}>{i}</td>)
                  })}
              </RulesGrid>
              </tbody>
            </Rules>
            <table style={{width:'5vw'}}>
            <tbody>
              <Delete>
                <td style={{visibility:'hidden'}}>0</td>
              </Delete>
              <Delete> 
                {deleteBtn.map((i)=>{return(<td style={{width:'5vw',margin:'1vh 0'}}>{i}</td>)})}
              </Delete>
            </tbody>
            </table>
          </Container>
          <Btn>
          <button onClick={()=>addData()}>규칙 추가</button>
          <div>
            <button onClick={() => navigate(`/dashboard/${instanceId}/${securityGroupId}`)}>뒤로가기(취소)</button>
            <button onClick={() => navigate(`/dashboard/${instanceId}/${securityGroupId}`)}>인바운드 규칙 저장</button>
          </div>
          </Btn>
        </Content>
        
      </>
    );
};

export default OutboundRules;


const Content = styled.div`
  padding: 0 5%;
  padding-top: 10vh;
  width: 90%;
`;
const Container = styled.div`
  display: flex;
  width: 100%;
`;
const Delete = styled.tr`
  display: flex;
  flex-wrap: wrap;
  margin: 4vh 0;
`;

const Rules = styled.table`
  width: 100%;  
`;

const RulesGrid  = styled.tr`
  display: flex;
  flex-wrap: wrap;
  justify-content: space-between;
  margin: 4vh 0;
`;

const Btn = styled.div`
  display: flex;
  justify-content: space-between;
`;