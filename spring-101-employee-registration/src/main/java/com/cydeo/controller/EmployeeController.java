package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import com.cydeo.model.Employee;
import com.cydeo.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
        employeeService.saveEmployee(
                new Employee("ozzy","dough", LocalDate.of(1980,12,19), "dsrgsrg", "ergaerbh","wergwg", "sfwEGWEG","QEFWEvfwe","asvwEV","WEVWEVWE")
        );
    }

    @GetMapping("/register")
    public String createEmployee(Model model){

        model.addAttribute("getAllStates",DataGenerator.getAllStates());
        model.addAttribute("employee", new Employee());

        return "/employee/employee-create";
    }

    @PostMapping("/confirm")
    public String confirmCreation(@ModelAttribute("employee") @Valid Employee employee, BindingResult bindingResult, Model model){

        if(bindingResult.hasErrors()){
            model.addAttribute("getAllStates",DataGenerator.getAllStates());
            return "/employee/employee-create";
        }
        employeeService.saveEmployee(employee);

        return "redirect:/employee/register";
    }

    @RequestMapping("/employees")
    public String employeeList(Model model){
        model.addAttribute("employees", employeeService.getEmployeeList());
        return "/employee/employee-list";
    }
}
