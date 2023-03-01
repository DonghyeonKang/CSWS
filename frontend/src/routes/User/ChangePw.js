import React, { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import TextField from '@mui/material/TextField';
import Button from '@mui/material/Button';
import Typography from '@mui/material/Typography';
import Avatar from '@mui/material/Avatar';
import Container from '@mui/material/Container';
import Box from '@mui/material/Box';
import styled from 'styled-components'

const StyledText = styled.div`
color:red;
font-size:0.8rem;
`;

const ChangePw = () => {
    const navigate = useNavigate();
    const [pw, setPw] = useState('');
    const [pw2, setPw2] = useState('');
    const [pwValid, setPwValid] = useState(false);
    const [pw2Valid, setPw2Valid] = useState(false);
    const [notAllow,setNotAllow] = useState(true);
    const handlePw = (e)=> {
      setPw(e.target.value);
      const regex =
        /^[a-zA-z0-9]{8,20}$/;
      if(regex.test(e.target.value)) {
        setPwValid(true);
      } else {
        setPwValid(false);
      }
    }
    const handlePw2 = (e)=> {
      setPw2(e.target.value);
      const regex =pw;
      if(regex===e.target.value) {
        setPw2Valid(true);
      } else {
        setPw2Valid(false);
      }
    }
    const onClickConfirmButton =() =>{
      if(pw!==pw2){
        alert('비밀번호를 다시 확인해주세요.');
      }
      else {
        alert('비밀번호 변경완료!');
        navigate('/login');
      }
    }
    //Enter로 버튼 클릭 가능하게
    const onCheckEnter = (e) => {
      if(e.key === 'Enter' && notAllow===false ) {
        onClickConfirmButton()
      }
    }
    //버튼 활성화 실시간으로
    useEffect(() =>{
      if(pwValid && pw2Valid){
        setNotAllow(false);
        return;
      }
      setNotAllow(true);
    },[pwValid,pw2Valid]);
    
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
          label="비밀번호"
          type="password"
          name="password"
          required
          fullWidth
          autoComplete="current-password"
          value={pw}
          onChange={handlePw}
          onKeyPress={onCheckEnter}

        />
        <div>
          {
            !pwValid && pw.length > 0 && (
              <StyledText>특문자 제외 영문자 숫자로 8자 이상 20자 미만으로 입력해주세요</StyledText>
            )}
        </div>        <TextField
          margin="normal"
          label="비밀번호 확인"
          type="password"
          name="passwordConfirm"
          required
          fullWidth
          autoComplete="current-password"
          value={pw2}
          onChange={handlePw2}
          onKeyPress={onCheckEnter}

        />
        <div>
          {
            !pw2Valid && pw2.length > 0 && (
              <StyledText>비밀번호가 일치하지 않습니다</StyledText>
            )}
        </div>        
        <Button
          disabled={notAllow}
          onClick={onClickConfirmButton}
          type="submit"
          fullWidth
          variant="contained"
          sx={{ mt: 3, mb: 2 }}
        >
          비밀번호 변경
        </Button>
      </Box>
    </Container>
    );
};

export default ChangePw;