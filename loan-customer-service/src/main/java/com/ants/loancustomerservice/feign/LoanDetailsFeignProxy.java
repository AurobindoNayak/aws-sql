package com.ants.loancustomerservice.feign;

import com.ants.loancustomerservice.vo.LoanDetails;
import jakarta.validation.Valid;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name="loan-details-service", url = "localhost:9042")
@FeignClient(name="loan-details-service")
public interface LoanDetailsFeignProxy {

    @GetMapping("/loan/{loantype}")
    public LoanDetails findLoamBasedOnType(@Valid @PathVariable String loantype);

}
