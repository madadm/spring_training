package com.cydeo.controller;

import com.cydeo.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String welcomePage(Model model){

        model.addAttribute("name", "Cydeo");
        model.addAttribute("course", "MVC");

        int studentId = new Random().nextInt();
        model.addAttribute("id", studentId);


        Student student = new Student(1, "Ozzy", "Jumla");

        model.addAttribute("student", student);
        //method model
        return "student/welcome";
    }
}
