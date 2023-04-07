package  com.example.studentmanagementsystem.Service.Teacher;

import com.example.studentmanagementsystem.DTO.StudentEnrolledClassesDto;
import com.example.studentmanagementsystem.Entity.Sclass;
import com.example.studentmanagementsystem.Entity.Student;
import com.example.studentmanagementsystem.Entity.Teacher;
import com.example.studentmanagementsystem.Repository.SclassRepository;
import com.example.studentmanagementsystem.Repository.StudentRepository;
import com.example.studentmanagementsystem.Repository.TeacherRepository;
import com.example.studentmanagementsystem.Service.Student.StudentService;
import com.example.studentmanagementsystem.Service.Teacher.TeacherService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

@Service
@Slf4j
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private final StudentRepository studentRepository;

    @Autowired
    private final TeacherRepository teacherRepository;

    @Autowired
    private final SclassRepository sclassRepository;


    @Override
    public Teacher registerTeacher(Teacher teacher) {
        boolean match =Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d\\w\\W]{8,}$",teacher.getPassword());

        if(match){
            String pass = Hashing.sha256()
                    .hashString(teacher.getPassword(), StandardCharsets.UTF_8)
                    .toString();
            teacher.setPassword(pass);
            System.out.println(teacher);
            Teacher newusr = teacherRepository.save(teacher);
            return newusr;
        }
        return null;
    }

    @Override
    public Teacher verifyUser(String username, String password) {
        Teacher teacher = teacherRepository.findByUsername(username);
        //match password 8 characters and atleast one character and number
        boolean match = Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d\\w\\W]{8,}$",password);
        System.out.println(match);
        String pass = Hashing.sha256().hashString(password, StandardCharsets.UTF_8).toString();

        return pass.equals(teacher.getPassword()) && match ? teacher : null;
    }


}
