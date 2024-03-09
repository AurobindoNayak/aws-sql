package com.ants.jpaspringboot.controller;

import com.ants.jpaspringboot.dao.PersonJpaRepo;
import com.ants.jpaspringboot.vo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonJpaController {

    @Autowired
    PersonJpaRepo  repo;

    @PostMapping("/addPerson")
    public ResponseEntity<Person> savePerson(@RequestBody Person person){
        return new ResponseEntity<>(repo.save(person), HttpStatus.CREATED);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Person>> getAllPerson(){
        return new ResponseEntity<>(repo.findAll(), HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Person> getPersonById(@PathVariable long id){
        return new ResponseEntity<>(repo.findById(id).get(), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePersonById(@PathVariable long id){
        Person person = repo.findById(id).get();
        repo.delete(person);
    }
}
