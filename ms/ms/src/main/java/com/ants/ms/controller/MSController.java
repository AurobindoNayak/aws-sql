package com.ants.ms.controller;

import com.ants.ms.configuration.ReadConfig;
import com.ants.ms.dto.AddressRepository;
import com.ants.ms.dto.EmployeeRepository;
import com.ants.ms.exception.EmployeeNotFoundException;
import com.ants.ms.vo.Address;
import com.ants.ms.vo.Employee;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MSController {

    @Autowired
    ReadConfig readConfig;

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    AddressRepository addressRepository;

    @GetMapping(value = "/read-config")
    public ResponseEntity<ReadConfig> readConfig() {
        return new ResponseEntity<>(readConfig, HttpStatus.OK);
    }

    @PostMapping("/employee")
    @Transactional
    public ResponseEntity<Employee> saveEmployee(@Valid @RequestBody Employee employee) {
        employee = employeeRepository.save(employee);
        return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }

    @GetMapping(value = "/employee",produces = "application/xml")
    public ResponseEntity<List<Employee>> getAllEmployee() {
        List<Employee> employees = employeeRepository.findAll();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if(employee.isEmpty()){
            throw new EmployeeNotFoundException("Employee Not Found for the id "+id);
        }
        return new ResponseEntity<>(employee.get(), HttpStatus.OK);
    }

    @PostMapping("/employee/{id}/address")
    public ResponseEntity<Address> saveAddressForUser(@PathVariable long id, @Valid @RequestBody Address address){
        Optional<Employee> employee = employeeRepository.findById(id);
        if(employee.isEmpty()){
            throw new EmployeeNotFoundException("Employee not found with the id "+id);
        }
        address.setEmployee(employee.get());
        address = addressRepository.save(address);
        return new ResponseEntity<>(address,HttpStatus.CREATED);
    }
}
