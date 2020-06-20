package com.v.Controller;

import com.v.Domain.Student;
import com.v.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("students")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @GetMapping("/list")
    public String list(Model model){
        List<Student> studentList=studentService.listAll();
        model.addAttribute("students",studentList);
        return "student-list";
    }

    @GetMapping("/updatestudent")
    public String updatestudent(@RequestParam("id")int studentId, Model model){
        Student std=studentService.get(studentId);
        model.addAttribute("student",std);
        return "student-form";
    }

    @GetMapping("/addstudent")
    public String addstudent(Model model){
        Student std=new Student();
        model.addAttribute("student",std);
        return "student-form";
    }

    @PostMapping("/savestudent")
    public String savestudent(@ModelAttribute("student") Student std){
        studentService.saveOrUpdate(std);
        return "redirect:/students/list";
    }

    @GetMapping("/deletestudent")
    public String deletestudent(@RequestParam("id") int studentId){
        studentService.delete(studentId);
        return "redirect:/students/list";
    }

}
