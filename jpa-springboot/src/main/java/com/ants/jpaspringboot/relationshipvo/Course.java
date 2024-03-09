package com.ants.jpaspringboot.relationshipvo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String courseName;
    @OneToMany(targetEntity = CourseReview.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id", referencedColumnName = "id")
    List<CourseReview> courseReview;

    //here we are making the student as owner
    //so we write the mappedby in course class
    // courses is the object which created for List<Course> inside student class
    @ManyToMany(mappedBy = "courses")
    List<Student> students;

}
