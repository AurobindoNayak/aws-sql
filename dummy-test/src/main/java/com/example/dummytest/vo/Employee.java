package com.example.dummytest.vo;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Employee {

        @Id
        private int id;
        private String name;
        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "address_id",referencedColumnName = "id" )
        private Address address;
}
