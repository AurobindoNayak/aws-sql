package com.ants.loanservice.loanservice.repo;

import com.ants.loanservice.loanservice.vo.LoanData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepo extends JpaRepository<LoanData,Long> {
}
