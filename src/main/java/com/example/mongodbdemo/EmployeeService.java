package com.example.mongodbdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    
    @Autowired
    EmployeeRepository employeeRepository; 
    
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll(); 
    }

    public Employee saveOneEmployee(Employee employee) {
        return employeeRepository.insert(employee); 
    }
}
