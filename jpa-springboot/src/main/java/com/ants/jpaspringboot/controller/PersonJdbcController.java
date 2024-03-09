package com.ants.jpaspringboot.controller;

import com.ants.jpaspringboot.dao.PersonDaoJdbc;
import com.ants.jpaspringboot.vo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonJdbcController {

    @Autowired
    private PersonDaoJdbc dao;

    @PostMapping("/savePerson")
    public int saveUser(@RequestBody Person person){
        return dao.savePerson(person);
    }
}
