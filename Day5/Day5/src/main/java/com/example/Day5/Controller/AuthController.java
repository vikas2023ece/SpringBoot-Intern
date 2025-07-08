package com.example.Day5.Controller;

import com.example.Day5.Models.Employee;
import com.example.Day5.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password) {
        Employee emp = employeeRepository.findByEmailAndPassword(email, password);
        if (emp != null) {
            return "Login successful. Welcome " + emp.getEmpname() + "!";
        } else {
            return "Invalid email or password.";
        }
    }
}
