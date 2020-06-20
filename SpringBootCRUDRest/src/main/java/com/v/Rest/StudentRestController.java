package com.v.Rest;

import com.v.Domain.Student;
import com.v.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentRestController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/{studentId}")
    public Student getStudent(@PathVariable int studentId){
        return studentService.get(studentId);
    }

    @GetMapping("")
    public List<Student> getStudents(){
        return studentService.listAll();
    }

    @PostMapping("")
    public Student addStudent(@RequestBody Student student){
        student.setId(0);
        return studentService.save(student);
    }
    @PutMapping("")
    public Student updateStudent(@RequestBody Student student){
        return studentService.save(student);
    }

    @DeleteMapping("/{studentId}")
    public int deleteStudent(@PathVariable int studentId){
        return studentService.delete(studentId);
    }



}
