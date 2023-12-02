package com.ants.customer.customerservice.feign;

import com.ants.customer.customerservice.vo.LoanData;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@EnableFeignClients
@FeignClient(name = "loan-service", url = "localhost:8082")
public interface LoanClientProxy {

    @GetMapping("/allowedLoans/{salary}")
    public LoanData getAllowedLoans(@PathVariable Double salary);


}
