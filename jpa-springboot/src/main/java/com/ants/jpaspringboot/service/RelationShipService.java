package com.ants.jpaspringboot.service;


import com.ants.jpaspringboot.dao.CourseRepo;
import com.ants.jpaspringboot.dao.PassportRepo;
import com.ants.jpaspringboot.dao.StudentRepo;
import com.ants.jpaspringboot.relationshipvo.Course;
import com.ants.jpaspringboot.relationshipvo.Passport;
import com.ants.jpaspringboot.relationshipvo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Service
public class RelationShipService {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    PassportRepo passportRepo;

    @Autowired
    CourseRepo courseRepo;

    @PersistenceContext
    EntityManager em;

    @Transactional
    public List<Student> saveStudents(List<Student> students) {
        return studentRepo.saveAll(students);
    }

    public Student getStudentById(int id) {
        return studentRepo.findById(id).get();
    }

    public Passport findPassportDetailsById(int id) {
        return passportRepo.findById(id).get();
    }

    @Transactional
    public Course addCourseWithReviews(Course course) {
        return courseRepo.save(course);
    }

    public Optional<Course> getCourseWithId(int courseId) {
        return courseRepo.findById(courseId);
    }

    public List<Student> addStudentWithCourses(List<Student> students) {
      for(Student student : students){
          List<Course> courses = student.getCourses();
          for(Course course : courses){
             Course coursePresent = courseRepo.findById(course.getId()).orElse(null);
              if(coursePresent==null)
              courseRepo.save(course);
          }
      }
        return studentRepo.saveAll(students);
    }
}
