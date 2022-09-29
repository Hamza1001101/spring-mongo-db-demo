package com.example.mongodbdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class EmployeeController {
    
    
    @Autowired
    EmployeeService employeeService; 
    
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees(); 
    }  
    
    @PostMapping("employee")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return  employeeService.saveOneEmployee(employee); 
    }
}
