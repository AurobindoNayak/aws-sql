package com.ants.loandetailsservice.dto;

import com.ants.loandetailsservice.vo.LoanDetails;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanDto extends JpaRepository<LoanDetails,Integer> {


    @Query(value = "SELECT * FROM loan_details l WHERE l.loan_type = ?", nativeQuery = true)
    public LoanDetails findByLoanType(String loanType);

}
