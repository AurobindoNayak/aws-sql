package com.ants.jpaspringboot.controller;


import com.ants.jpaspringboot.relationshipvo.Course;
import com.ants.jpaspringboot.relationshipvo.CourseReview;
import com.ants.jpaspringboot.relationshipvo.Passport;
import com.ants.jpaspringboot.relationshipvo.Student;
import com.ants.jpaspringboot.service.RelationShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import java.util.List;

@RestController
public class RelationShipController {

    @Autowired
    private RelationShipService relationShipService;

    @Autowired
    EntityManager em;

    //one to one
    @PostMapping("/addStudents")
    public ResponseEntity<List<Student>> addStudents(@RequestBody List<Student> students) {
        return new ResponseEntity<>(relationShipService.saveStudents(students), HttpStatus.CREATED);
    }

    @GetMapping("/findStudent/{id}")
    public ResponseEntity<Student> findStudentByid(@PathVariable int id) {
        return new ResponseEntity<>(relationShipService.getStudentById(id), HttpStatus.OK);
    }

    @GetMapping("/findPassport/{id}")
    public ResponseEntity<Passport> findPassportByid(@PathVariable int id) {
        return new ResponseEntity<>(relationShipService.findPassportDetailsById(id), HttpStatus.OK);
    }
//    @GetMapping("/findPassport/{id}")
//    public ResponseEntity<Passport> findPassportByidem(@PathVariable int id){
//        return new ResponseEntity<>(em.find(Passport.class,id),HttpStatus.OK);
//    }

    //one to many
    @PostMapping("/addCourse")
    public ResponseEntity<Course> addCourseWithReview(@RequestBody Course course) {
        if (!String.valueOf(course.getId()).isEmpty()) {
            Course course1 = relationShipService.getCourseWithId(course.getId()).orElse(null);
            if (course1 != null) {
                List<CourseReview> courseReviews = course1.getCourseReview();
                course.getCourseReview().stream().forEach(review -> courseReviews.add(review));
                course1.setCourseReview(courseReviews);
                return new ResponseEntity<>(relationShipService.addCourseWithReviews(course1), HttpStatus.CREATED);
            }
        }
        return new ResponseEntity<>(relationShipService.addCourseWithReviews(course), HttpStatus.CREATED);
    }

    @PostMapping("/addStudentsWithCourse")
    public ResponseEntity<List<Student>> addStudentWithCourse(@RequestBody List<Student> studentList) {
        return new ResponseEntity<>(relationShipService.addStudentWithCourses(studentList), HttpStatus.CREATED);
    }

}
