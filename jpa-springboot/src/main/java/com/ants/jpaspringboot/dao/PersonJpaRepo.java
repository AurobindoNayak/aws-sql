package com.ants.jpaspringboot.dao;

import com.ants.jpaspringboot.vo.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonJpaRepo extends JpaRepository<Person,Long> {
}
