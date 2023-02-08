import React, { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import TextField from '@mui/material/TextField';
import Button from '@mui/material/Button';
import Typography from '@mui/material/Typography';
import Avatar from '@mui/material/Avatar';
import Container from '@mui/material/Container';
import Box from '@mui/material/Box';

//더미데이터
const User = {
  email: 'wkdroal11@gmail.com',
  pw: 'hyuk0229'
}

const SignUp = () => {
    const navigate = useNavigate();
    //이메일, 비밀번호, 비밀번호 확인
    const [email, setEmail] = useState('');
    const [pw, setPw] = useState('');
    const [pw2, setPw2] = useState('');
    //유효성 검사
    const [emailValid, setEmailValid] = useState(false);
    const [pwValid, setPwValid] = useState(false);
    const [pw2Valid, setPw2Valid] = useState(false);
    const [notAllow,setNotAllow] = useState(true);
    //이메일 오류메세지
    const handleEmail = (e)=> {
      setEmail(e.target.value);
      const regex =
        /^(([^<>()\].,;:\s@"]+(\.[^<>()\].,;:\s@"]+)*)|(".+"))@(([^<>()[\].,;:\s@"]+\.)+[^<>()[\].,;:\s@"]{2,})$/i;
      if (regex.test(e.target.value)) {
        setEmailValid(true);
      } else {
        setEmailValid(false);
      }
    }
    //비밀번호 오류메세지
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
    //비밀번호 확인 오류메세지
    const handlePw2 = (e)=> {
      setPw2(e.target.value);
      const regex =pw;
      if(regex===e.target.value) {
        setPw2Valid(true);
      } else {
        setPw2Valid(false);
      }
    }
    //회원가입 버튼 눌렀을 시 메세지
    const onClickConfirmButton =() =>{
      if(email === User.email){
        alert('이미 등록된 이메일입니다.');
      }
      else if(pw!==pw2){
        alert('비밀번호를 다시 확인해주세요.');
      }
      else {
        alert('회원가입 되셨습니다!.');
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
      if(emailValid && pwValid && pw2Valid){
        setNotAllow(false);
        return;
      }
      setNotAllow(true);
    },[emailValid,pwValid,pw2Valid]);
    
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
          required
          fullWidth
          autoComplete="email"
          autoFocus
          value={email}
          onChange={handleEmail}
          onKeyPress={onCheckEnter}
          
        />
        <div>
          {
            !emailValid && email.length > 0 && (
              <div>올바른 이메일 형식을 입력해주세요</div>
            )}
        </div>
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
              <div>특문자 제외 영문자 숫자로 8자 이상 20자 미만으로 입력해주세요</div>
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
              <div>비밀번호가 일치하지 않습니다</div>
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
          가입하기
        </Button>

      </Box>
    </Container>
    );
};

export default SignUp;