package com.v.Controller;

import com.v.Domain.Student;
import com.v.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class HelloThymeleaf {

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("isim","Volkan");
        model.addAttribute("tarih",new Date());
        return "hello";
    }

}
