package cn.lmx.student.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.lmx.student.model.Student;
import cn.lmx.student.service.StudentService;

/**
 * 大文件上传
 */
@RestController
@RequestMapping("/Student")
public class StudentController {
	
    @Autowired
    private StudentService studentService;


    @PostMapping("/addStudent")
    public void saveStudent(Student student) throws IOException {
    	
    	Date date = new Date();
    	student.setStartDate(date);
    	studentService.save(student);
    }

    @GetMapping("/deleteStudent")
    public void deleteStudent(Integer id) throws IOException {
    	
    	studentService.deleteStudent(id);
    }

    @PostMapping("/updateStudent")
    public void updateStudent(Student student) throws IOException {
    	
    	Date date = new Date();
    	student.setStartDate(date);
    	studentService.save(student);
    }

    @GetMapping("/getOneStudent")
    public Student getOneStudent(Integer id) throws IOException {
    	
    	return studentService.getOneStudent(id);
    }

    @GetMapping("/findAllStudent")
    public List<Student> findAllStudent() throws IOException {
    	
    	
    	return studentService.findAllStudent();
    }

}
