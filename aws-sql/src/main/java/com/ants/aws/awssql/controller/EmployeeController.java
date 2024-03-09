package com.ants.aws.awssql.controller;

import com.ants.aws.awssql.dao.EmployeeDAO;
import com.ants.aws.awssql.vo.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeDAO employeeDAO;

    @PostMapping("/add-all-emp")
    @Transactional
    public ResponseEntity<List<Employee>> addEmployee(@RequestBody List<Employee> employeeList) {
        List<Employee> employeeLists = employeeDAO.saveAll(employeeList);
        return new ResponseEntity<>(employeeLists, HttpStatus.CREATED);
    }

    @GetMapping("/get-all-emp")
    public ResponseEntity<List<Employee>> getAllEmployee() {
        List<Employee> employeeLists = employeeDAO.findAll();
        return new ResponseEntity<>(employeeLists, HttpStatus.OK);
    }
   @GetMapping("/get-emp/{empId}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable long empId) {
        Employee employee = employeeDAO.findById(empId).get();
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }
    @DeleteMapping("/remove-emp/{empId}")
    @Transactional
    public ResponseEntity<String> removeEmployeeById(@PathVariable long empId) {
        Optional<Employee> employee = employeeDAO.findById(empId);
        String message=null;
        //optional.isPresent()?employeeDAO.delete(optional.get());
        if(employee.isPresent()){
            employeeDAO.delete(employee.get());
            message = "Employee Successfully Removed";
        }else{
            message = "Unable to find Employee";
        }
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
