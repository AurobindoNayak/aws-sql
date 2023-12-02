package com.example.dummytest.controller;


import com.example.dummytest.respository.EmployeeRepo;
import com.example.dummytest.vo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmploeeController {
    @Autowired
    EmployeeRepo employeeRepo;

    @PostMapping("/save-all-emp")
    public List<Employee> employees(@RequestBody List<Employee> emps){
        return employeeRepo.saveAll(emps);
    }

    @GetMapping("/get-emp/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable int id){
        return employeeRepo.findById(id);
    }
}
