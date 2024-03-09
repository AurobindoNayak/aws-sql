package com.ants.loandetailsservice.controller;

import com.ants.loandetailsservice.dto.LoanDto;
import com.ants.loandetailsservice.vo.LoanDetails;
import jakarta.validation.Valid;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@EnableCaching
@Slf4j
public class LoanController {

    @Autowired
    private LoanDto loanDto;

    @Autowired
    Environment environment;


    @PostMapping("/loan")
    @CacheEvict(value = "loan", allEntries = true)
    public ResponseEntity<LoanDetails> addLoan(@Valid @RequestBody LoanDetails loanDetails) {
        loanDetails = loanDto.save(loanDetails);
        return new ResponseEntity<>(loanDetails, HttpStatus.CREATED);
    }

    @GetMapping("/loan/{loantype}")
    public ResponseEntity<LoanDetails> findLoamBasedOnType(@Valid @PathVariable String loantype) {
        LoanDetails loanDetails = loanDto.findByLoanType(loantype);
        loanDetails.setPort(Integer.parseInt(environment.getProperty("server.port")));
        return new ResponseEntity<>(loanDetails, HttpStatus.OK);
    }

    @GetMapping("/loan")
    @Cacheable("loan")
    public ResponseEntity<List<LoanDetails>> findLoamBasedOnType() {
        log.info("invoking 1st time ::::");
        List<LoanDetails> loanDetails = loanDto.findAll();
        loanDetails.forEach(x -> x.setPort(Integer.parseInt(environment.getProperty("server.port"))));
        return new ResponseEntity<>(loanDetails, HttpStatus.OK);
    }
}
