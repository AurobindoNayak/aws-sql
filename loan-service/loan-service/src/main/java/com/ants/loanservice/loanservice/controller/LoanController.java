package com.ants.loanservice.loanservice.controller;

import com.ants.loanservice.loanservice.repo.LoanRepo;
import com.ants.loanservice.loanservice.vo.LoanData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

@RestController
public class LoanController {

    @Autowired
    private LoanRepo repo;

    @PostMapping("/addLoanDetails")
    public ResponseEntity<LoanData> addLoanDetails(@RequestBody LoanData loanData) {
        LoanData ld = repo.save(loanData);
       return  new ResponseEntity<>(ld, HttpStatus.CREATED);

    }
    @GetMapping("/allowedLoans/{salary}")
    public LoanData getAllowedLoans(@PathVariable Double salary){
        if (isAllowedForPersonalLoan(salary)) {
            LoanData ld = repo.findAll().get(0);
            ResponseEntity<LoanData> rt = new ResponseEntity<>(ld,HttpStatus.OK);
            ld.setAllowed(isAllowedForPersonalLoan(salary));
            ld.setUlternateOffersAvail(availOffers(salary));
            return rt.getBody();
        }else{
            LoanData ld = new LoanData();
            ld.setAllowed(isAllowedForPersonalLoan(salary));
            ld.setUlternateOffersAvail(availOffers(salary));
            return ld;
        }
    }
    private boolean isAllowedForPersonalLoan(Double salary) {

        return salary > 20000 ? true : false;
    }

    private List<String> availOffers(Double salary) {
        return salary >=25000 ? Arrays.asList("Home Loan", "Vehicle Loan") : salary > 20000 && salary<25000 ? Arrays.asList("Personal Loan") : Arrays.asList("Sorry you are not eligible for any loan");
    }
}
