package com.ants.customer.customerservice.controller;

import com.ants.customer.customerservice.repo.CustomerRepo;
import com.ants.customer.customerservice.vo.Customer;
import com.ants.customer.customerservice.vo.LoanData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class CustomerController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private CustomerRepo customerRepo;

    @PostMapping("/addCustomer")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
        return new ResponseEntity<>(customerRepo.save(customer), HttpStatus.CREATED);
    }

    @GetMapping("/getLoanDetails/{id}")
    public Customer getEligibleLoans(@PathVariable long id) {
        Customer ct = customerRepo.findById(id).get();
        Map<String,Double> uriMap = new LinkedHashMap<>();
        uriMap.put("salary",ct.getSalary());
        ResponseEntity<LoanData> loanData =  restTemplate.getForEntity("http://localhost:8082/allowedLoans/{salary}", LoanData.class,uriMap);
        ct.setEligbleforLoan(loanData.getBody().isAllowed());
        ct.setAvailOffers(loanData.getBody().getAlternateOffersAvail());
        //ct.set
        return ct;
    }

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
