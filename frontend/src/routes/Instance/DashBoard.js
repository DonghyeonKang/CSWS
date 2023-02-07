import { useNavigate } from "react-router-dom";
import styled from "styled-components";
import Header from "../../components/Header";

const DashBoard = () => {
  const navigate = useNavigate();
  const tHead = ['이름', '인스턴스 ID', '상태', '용량', 'IPv4 주소 및 포트', '키 이름'];
  const tBody = ['1', '2', '3', '4', '5', '6'];
    return (
      <>
        <Header/>
        <Content>
          <div>DashBoard</div>
          <ContentHeader>
            <div>인스턴스</div>
            <button onClick={() => navigate('createInstance')}>인스턴스 생성</button>
          </ContentHeader>
          
          <InstanceTable>
            <thead>
              <tr>
                {tHead.map((t)=> {return(<InstanceHeader key={t}>{t}</InstanceHeader>)})}
              </tr>
            </thead>
            <tbody>
              <tr>
                {tBody.map((t)=>{return(<InstanceBody key={t}>{t}</InstanceBody>)})}
              </tr>
            </tbody>
          </InstanceTable>
          <button onClick={() => navigate(`${Date.now()}`)}>인스턴스 상세</button>{/*임시 인스턴스 ID 생성*/}
          <span>(인스턴스 id에 a 태그로)</span>
        </Content>
      </>
    );
};
//이름 / 인스턴스 ID / 상태 / 용량 / IPv4 주소 및 포트 / 키 이름
export default DashBoard;

const Content = styled.div`
  padding: 0 5%;
  padding-top: 10vh;
`;

const ContentHeader = styled.div`
  display: flex;
  justify-content: space-between;
  margin: 2% 0;
`;

const InstanceTable = styled.table`
  width: 100%;
  display: table;
`;

const InstanceHeader = styled.th`
  display: table-cell;
  border: 1px solid black;
`;

const InstanceBody = styled.td`
  display: table-cell;
  border: 1px solid black;
  text-align: center;
`;