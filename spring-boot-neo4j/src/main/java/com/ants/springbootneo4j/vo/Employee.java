package com.ants.springbootneo4j.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.driver.Config;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@NodeEntity
public class Employee {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private double salary;
    @Relationship(type = "address" , direction = Relationship.Direction.INCOMING)
    private List<Address> addressList;
}
