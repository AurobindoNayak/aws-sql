package com.example.dummytest.vo;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {

    @Id
    private int id;
    private String city;
    private String state;
//    @JsonIgnore
//    @OneToOne(mappedBy = "address")
//    private Employee employee;
}
