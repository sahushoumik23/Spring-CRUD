package com.practice.crud.repository;

import com.practice.crud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>
{
    public Employee findByName(String name);
    public Employee findByEmail(String email);
}
