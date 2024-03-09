package com.ants.jpaspringboot.dao;

import com.ants.jpaspringboot.relationshipvo.Passport;
import com.ants.jpaspringboot.relationshipvo.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassportRepo extends JpaRepository<Passport,Integer> {
}
