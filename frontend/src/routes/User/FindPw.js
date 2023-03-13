import React, { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import MyTextField from '../../components/User/FindPw/MyTextField';
import MyButton from "../../components/User/FindPw/MyButton";
import MyTypography from '../../components/User/FindPw/MyTypography';
import Container from '@mui/material/Container';
import MyBox from '../../components/User/FindPw/MyBox';
import AvatarComponent from '../../components/User/FindPw/AvatarComponent'; 
import { useRecoilState } from "recoil";
import { loginState } from "../../Atoms";

//더미데이터
const User = {
  email: 'wkdroal11@gmail.com',
  pw: '12341234'
}

const FindPw = () => {
  const navigate = useNavigate(); 
  const [email, setEmail] = useState('');
  const [,setUserState] = useRecoilState(loginState);
  const [emailValid, setEmailValid] = useState(false);
  const [notAllow,setNotAllow] = useState(true);
  useEffect(() =>{
    if(emailValid){
        setNotAllow(false);
        return;
      }
      setNotAllow(true);
      },[emailValid]);
  //
  const handleEmail = (e)=> {
    setEmail(e.target.value);
    if(e.target.value.length > 0) {
      setEmailValid(true);
    } else {
      setEmailValid(false);
    }
  };


  const onClickConfirmButton =() =>{
    if(email === User.email){
      setUserState(1);
      navigate('/login/findpw/ChangePw');
    } else {
      alert('존재하지 않는 이메일입니다.');
    }
  }

  const onCheckEnter = (e) => {
    if(e.key === 'Enter' && notAllow===false ) {
      onClickConfirmButton()
    }
  
  }
  return (
    <Container component="main" maxWidth="xs">
      <MyBox>
        <AvatarComponent/>
        <MyTypography>CSWS</MyTypography>
        <MyTextField
          value={email}
          onChange={handleEmail}
          onKeyPress={onCheckEnter}
        />
        <MyButton 
          disabled={notAllow}
          onClick={onClickConfirmButton} />
      </MyBox>
    </Container>
  );
}

export default FindPw;