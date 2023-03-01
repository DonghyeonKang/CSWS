import React, { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import TextField from '@mui/material/TextField';
import Button from '@mui/material/Button';
import Typography from '@mui/material/Typography';
import Avatar from '@mui/material/Avatar';
import Container from '@mui/material/Container';
import Box from '@mui/material/Box';
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
      <Box
        sx={{
          marginTop: 8,
          display: 'flex',
          flexDirection: 'column',
          alignItems: 'center',
        }}
      >
        <Avatar sx={{ m: 1, bgcolor: 'secondary.main' }}>
        </Avatar>
        <Typography component="h1" variant="h5">
          CSWS
        </Typography>
        <TextField
          margin="normal"
          label="이메일"
          name="emaill"
          placeholder="이메일을 입력해주세요"
          required
          fullWidth
          autoComplete="email"
          autoFocus
          value={email}
          onChange={handleEmail}
          onKeyPress={onCheckEnter}
        />
        <Button 
          disabled={notAllow}
          onClick={onClickConfirmButton}
          type="submit"
          fullWidth
          variant="contained"
          sx={{ mt: 3, mb: 2 }}
        >
          비밀번호 찾기
        </Button>
      </Box>
    </Container>
  );
}

export default FindPw;