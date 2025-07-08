package com.example.Day5.Controller;

import com.example.Day5.Models.Employee;
import com.example.Day5.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/register")
    public String registerEmployee(@RequestBody Employee employee) {
        employeeRepository.save(employee);
        return "Employee registered successfully!";
    }
}
