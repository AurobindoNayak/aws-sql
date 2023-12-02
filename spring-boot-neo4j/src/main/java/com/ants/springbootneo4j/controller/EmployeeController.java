package com.ants.springbootneo4j.controller;

import com.ants.springbootneo4j.repository.EmployeeRepo;
import com.ants.springbootneo4j.vo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepo employeeRepo;

    @PostMapping("/saveemp")
    public Employee addEmployee(@RequestBody Employee emp){
        return employeeRepo.save(emp);
    }
}
