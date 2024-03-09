package com.ants.springbootneo4j.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@NodeEntity
public class Address {

    @Id
    @GeneratedValue
    private long id;
    private String place;
}
