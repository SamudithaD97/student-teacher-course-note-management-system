import axios from "axios";
import { useState } from "react";
import "../components/teachersRegistration.css";
import Button from "@mui/material/Button";
import { TextField } from "@mui/material";
import sms from "../sms.png";
import { useNavigate } from "react-router-dom";

function TeachersRegister() {
  const [username,setUsername]=useState("");
  const [password, setPassword] = useState("");
  const [contactNo, setContactNo] = useState("");
  const [fullName, setFullName] = useState("");
  const [birthDate, setBirthDate] = useState("");
  const [designation, setDesignation] = useState("");
  const navigate = useNavigate();

  async function handleSubmit(event) {
    event.preventDefault();

    await axios
      .post("http://localhost:8080/teacher-register", {
        username: username,
        password: password,
        contactNo: contactNo,
        fullName: fullName,
        birthDate: birthDate,
        designation : designation
      })
      .then((res) => {
        alert("Teacher Registation Successfully");
        console.log(res);
        setUsername("");
        setPassword("");
        setContactNo("");
        setFullName("");
        setBirthDate("");
        setDesignation("");
        navigate('/teachersLogin');
      })
      .catch((err) => {
        alert("Teacher Registation Failed");
      });
  }

  return (
    <div className="grid grid-cols-1 sm:grid-cols-2">
      <div className="hidden sm:block bg-indigo-900 h-screen w-3/4">
  <div className="transform rotate-45 md:-rotate-45">
    <img src={sms} alt="sms" className="object-contain" />
  </div>
</div>
      <div className="bg-white justify-center flex flex-col h-screen my-auto items-center bgimg bg-cover ">
        <form
          className="register-form flex flex-col space-y-10 ... "
          onSubmit={handleSubmit}
        >
          <div className="flex flex-col space-y-20 ...">
            <div>
            <div className="text-align: center font-bold ... underline underline-offset-4 ... text-5xl ...flex flex-col italic ... font-weight: 300]">
                FUTURE EDUCATION-Teachers Registation
              </div>
            </div>
            <div>
              <TextField
                name="username"
                placeholder="Email"
                type={'email'}
                onChange={(event) => {
                  setUsername(event.target.value);
                }}
                variant="standard"
                color="warning"
                focused
              />
            </div>
          </div>
          <div>
            <TextField
              name="password"
              type="password"
              placeholder="Password"
              onChange={(event) => {
                setPassword(event.target.value);
              }}
              variant="standard"
              color="warning"
              focused
              helperText="Password must be atleast 8 characters, Uppercase and A number"
            />
          </div>
          <div>
            <TextField
              name="contactNo"
              placeholder="Contact No"
              onChange={(event) => {
                setContactNo(event.target.value);
              }}
              variant="standard"
              color="warning"
              focused
            />
          </div>

          <div>
            <TextField
              name="fullName"
              placeholder="Name"
              onChange={(event) => {
                setFullName(event.target.value);
              }}
              variant="standard"
              color="warning"
              focused
            />
          </div>
          <div>
            <TextField
              name="designation"
              placeholder="Designation"
              onChange={(event) => {
                setDesignation(event.target.value);
              }}
              variant="standard"
              color="warning"
              focused
            />
          </div>
          <div>
  <input type='date'
         onChange={(event) => {
           setBirthDate(event.target.value);
         }}
         variant="standard"
         color="warning"
         focused
         name="birthDate"
         placeholder="Enter your birth date (DD/MM/YYYY)"
  />
</div>
          <div>
            <Button variant="contained" size="large" type="submit">
              Register 
            </Button>
          </div>
        </form>
      </div>
    </div>
  );
}

export default TeachersRegister;
