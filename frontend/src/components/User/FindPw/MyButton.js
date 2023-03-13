import React from "react";
import Button from "@mui/material/Button";

const MyButton = ({ disabled, onClick }) => {
  return (
    <Button
      disabled={disabled}
      onClick={onClick}
      type="submit"
      fullWidth
      variant="contained"
      sx={{ mt: 3, mb: 2 }}
    >
      비밀번호 찾기
    </Button>
  );
};

export default MyButton;
