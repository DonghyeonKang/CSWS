import { useState } from "react";
import styled from "styled-components";

// 새로운 규칙 배열 저장, 수정하고, 삭제시 배열에서 삭제만
// setData 규칙 ID 값으로 filter 함수 써서 설정하기

const NewInboundRule = ({data, setData, i}) => {
    const obj = {
        type:data[i?.Id]?.type,
        protocol:data[i?.Id]?.protocol,
        port:data[i?.Id]?.port,
        CIDR:data[i?.Id]?.CIDR,
    };
    const [rule,setRule] = useState(obj);
    /*setData 쓸때 사용할 거
    data.filter((item)=>item?.Id !== i.Id);
    setData([...위에꺼,obj]);
    */
    return (
        <>
            <tr key={data[i?.Id]?.Id}>
                <td style={{width:'12vw', minWidth:'150px'}}>{i?.Id}</td>
                <td>
                    <select name="type" style={{width:'12vw', minWidth:'150px'}} onChange={(e)=>setRule({...rule, type: e.target.value})} defaultValue={data.type}>
                        <option value='1'>1</option>
                        <option value='2'>2</option>
                        <option value='3'>3</option>
                    </select>
                </td>
                <td><input style={{width:'5vw', minWidth:'80px'}} defaultValue={i?.protocol} onChange={(e)=>setRule({...rule, protocol: e.target.value})}/></td>
                <td><input style={{width:'6vw', minWidth:'100px'}} onClick={()=>console.log(rule)} defaultValue={i?.port} onChange={(e)=>setRule({...rule, port: e.target.value})}/></td>
                <td>
                    <select name="CIDR" style={{width:'12vw', minWidth:'150px'}} onChange={(e)=>setRule({...rule, CIDR: e.target.value})} defaultValue={data.CIDR}>
                        <option value='1'>1</option>
                        <option value='2'>2</option>
                        <option value='3'>3</option>
                    </select>
                </td>
                <DeleteRule onClick={()=>{setData(data.filter((item)=>item?.Id !== i?.Id))}}>삭제</DeleteRule>
            </tr>
        </>
    );
};

export default NewInboundRule;

const DeleteRule = styled.td`
  cursor: pointer;
  background-color: white;
  border: 1px solid black;
  text-align: center;
  width: 50px;
  &:hover{
    background-color: #fafafa;
    color: black;
  }
`;