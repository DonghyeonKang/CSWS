import { useNavigate } from "react-router-dom";
import styled from "styled-components";

const InstanceList = () => {
    const navigate = useNavigate();
    const tBody = ['','1', '2', '3', '4', '5', '6'];
    return (
        <>
            <InstanceTable>
                <thead>
                <tr>
                    <InstanceHeader> </InstanceHeader>
                    <InstanceHeader>이름</InstanceHeader>
                    <InstanceHeader>인스턴스 ID</InstanceHeader>
                    <InstanceHeader>상태</InstanceHeader>
                    <InstanceHeader>용량</InstanceHeader>
                    <InstanceHeader>IPv4 주소 및 포트</InstanceHeader>
                    <InstanceHeader>키 이름</InstanceHeader>
                </tr>
                </thead>
                <tbody>
                <tr>
                    {tBody.map((t)=>{return(<InstanceBody key={t}>{t}</InstanceBody>)})}
                </tr>
                </tbody>
            </InstanceTable>
            <button onClick={() => navigate(`${Date.now()}`)}>인스턴스 상세</button>{/*임시 인스턴스 ID 생성*/}
            <span>(인스턴스 id에 넣기)</span>
        </>
    );
};

export default InstanceList;

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