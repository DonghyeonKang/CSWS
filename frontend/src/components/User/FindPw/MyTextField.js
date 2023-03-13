import TextField from '@mui/material/TextField';

const MyTextField = (props) => {
  return (
    <TextField
      margin="normal"
      required
      fullWidth
      {...props}
    />
  );
}

export default MyTextField;
