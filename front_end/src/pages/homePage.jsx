import { useNavigate } from 'react-router-dom';
import "../components/homePage.css";

function HomePage() {
  const navigate = useNavigate();

  const handleStudentLogin = () => {
    navigate('/login');
  };

  const handleTeacherLogin = () => {
    navigate('/teachersLogin');
  };

  return (
    <div className="flex flex-col justify-center items-center h-screen">
      <h1 className="text-3xl font-bold mb-8">Welcome to Student Management System</h1>
      <div className="grid grid-cols-2 gap-4 mb-4">
        <a href="/register" className="bg-blue-500 hover:bg-blue-700 text-white font-bold py-4 px-8 rounded">
          Students
        </a>
        <a href="/teachersRegister" className="bg-green-500 hover:bg-green-700 text-white font-bold py-4 px-8 rounded">
          Teachers
        </a>
      </div>
      <div className="grid grid-cols-2 gap-4">
        <button onClick={handleStudentLogin} className="bg-gray-500 hover:bg-gray-700 text-white font-bold py-4 px-8 rounded">
          Login as Student
        </button>
        <button onClick={handleTeacherLogin} className="bg-gray-500 hover:bg-gray-700 text-white font-bold py-4 px-8 rounded">
          Login as Teacher
        </button>
      </div>
    </div>
  );
}

export default HomePage;