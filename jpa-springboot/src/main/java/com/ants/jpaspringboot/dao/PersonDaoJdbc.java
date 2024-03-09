package com.ants.jpaspringboot.dao;

import com.ants.jpaspringboot.vo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonDaoJdbc {

    @Autowired
    JdbcTemplate jdbcTemplate;
    public static final String INSERT_QUERY = "insert into person (id,name,Salary,age) values (?,?,?,?) ";
    public static final String FINDALL_QUERY = "select * from person";

    public int savePerson(Person person) {
        return jdbcTemplate.update(INSERT_QUERY, person.getId(), person.getName(), person.getSalary(), person.getAge());
    }

}
