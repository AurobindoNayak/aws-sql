package com.ants.loancustomerservice.vo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoanDetails {

    private int id;
    private String loanType;
    private float interestRate;
    private int port;
}
