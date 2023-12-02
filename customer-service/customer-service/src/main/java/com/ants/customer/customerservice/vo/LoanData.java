package com.ants.customer.customerservice.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LoanData {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String loanType;
    private float rateOfInterest;
    @Transient
    private boolean isAllowed;
    @Transient
    private List<String> alternateOffersAvail;
}
