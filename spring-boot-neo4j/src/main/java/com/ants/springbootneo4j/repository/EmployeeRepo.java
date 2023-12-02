package com.ants.springbootneo4j.repository;

import com.ants.springbootneo4j.vo.Employee;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends Neo4jRepository<Employee,Long> {
}
