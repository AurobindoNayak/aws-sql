package com.ants.ms.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Value;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.List;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Size(min = 2, message = "Name should contain at-least 2 character")
    private String name;
    private double salary;
    //one employee can have multiple address
    @OneToMany(mappedBy = "employee")
    //@JsonIgnore
    private List<Address> address;
}
