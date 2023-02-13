import React, { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import TextField from '@mui/material/TextField';
import Button from '@mui/material/Button';
import Link from '@mui/material/Link';
import Grid from '@mui/material/Grid';
import Typography from '@mui/material/Typography';
import Avatar from '@mui/material/Avatar';
import Container from '@mui/material/Container';
import Box from '@mui/material/Box';
import InputAdornment from '@mui/material/InputAdornment';
import { useRecoilState } from "recoil";
import { loginState } from "../../Atoms";
import VisibilityIcon from '@mui/icons-material/Visibility';
import VisibilityOffIcon from '@mui/icons-material/VisibilityOff';

//더미데이터
const User = {
  email: 'wkdroal11@gmail.com',
  pw: '12341234'
}

const Login = () => {
  const navigate = useNavigate();
  //이메일,비밀번호
  const [email, setEmail] = useState('');
  const [pw, setPw] = useState('');
  //유효성 검사
  const [,setUserState] = useRecoilState(loginState);
  const [emailValid, setEmailValid] = useState(false);
  const [pwValid, setPwValid] = useState(false);
  const [notAllow,setNotAllow] = useState(true);
  const [passwordType, setPasswordType] = useState({
    type: 'password',
    visible: false});

  useEffect(() =>{
    if(emailValid && pwValid){
        setNotAllow(false);
        return;
      }
      setNotAllow(true);
      },[emailValid,pwValid]);

  const handleEmail = (e)=> {
    setEmail(e.target.value);
    if(e.target.value.length > 0) {
      setEmailValid(true);
    } else {
      setEmailValid(false);
    }
  };

  const handlePw = (e)=> {
    setPw(e.target.value);
    if(e.target.value.length > 0) {
      setPwValid(true);
    } else {
      setPwValid(false);
    }
  }


  const onClickConfirmButton =() =>{
    if(email === User.email && pw=== User.pw){
      alert('로그인 성공!.');
      setUserState(1);
      navigate('/');
    } else {
      alert('이메일 또는 비밀번호가 일치하지 않습니다.');
    }
  }

  const onCheckEnter = (e) => {
    if(e.key === 'Enter' && notAllow===false ) {
      onClickConfirmButton()
    }
  
  }
  const handlePasswordType = e => {
    setPasswordType(() => {
        if (!passwordType.visible) {
            return { type: 'text', visible: true };
        }
        return { type: 'password', visible: false };
    })
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
          placeholder="example@company.com"
          required
          fullWidth
          autoComplete="email"
          autoFocus
          value={email}
          onChange={handleEmail}
          onKeyPress={onCheckEnter}
        />
        <TextField
          margin="normal"
          label="비밀번호"
          type={passwordType.type}
          name="password"
          placeholder="특수문자 제외, 영문, 숫자 포함 8자 이상"
          required
          fullWidth
          autoComplete="current-password"
          value={pw}
          onChange={handlePw}
          onKeyPress={onCheckEnter}
          InputProps={{
            endAdornment: (
              <InputAdornment position="end">
                <VisibilityIcon
                onClick={handlePasswordType}
                />
              </InputAdornment>
            )
            }}/>
        <Button 
          disabled={notAllow}
          onClick={onClickConfirmButton}
          type="submit"
          fullWidth
          variant="contained"
          sx={{ mt: 3, mb: 2 }}
        >
          로그인
        </Button>
        <Grid container>
          <Grid item xs>
            <Link href="/login/pw">비밀번호 재설정</Link>
          </Grid>
          <Grid item>
            <Link href="login/signup">회원가입</Link>
          </Grid>
        </Grid>
      </Box>
    </Container>
  );
}

export default Login;