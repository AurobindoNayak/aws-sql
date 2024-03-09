package com.ants.aws.awssql.vo;


import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @NotNull(message = "name can't be empty")
    private String name;
    @NotNull(message = "state can't be empty")
    private String state;
    @NotNull(message = "salary can't be empty")
    private double salary;
}
