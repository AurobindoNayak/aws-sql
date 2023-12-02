package com.ants.jpaspringboot.relationshipvo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String passportNumber;
    //here we are making the Student as the owner in one to one.
    // so we wrote mapped by in the Passport class
    //passport is the object name of Passport class in Student
//    @OneToOne(fetch = FetchType.LAZY,mappedBy = "passport")
//    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//    private Student student;
}
