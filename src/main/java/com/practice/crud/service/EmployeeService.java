package com.practice.crud.service;

import com.practice.crud.model.Employee;
import com.practice.crud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService
{
    @Autowired
    private EmployeeRepository repository;

    //    Retrieve All Records
    public List<Employee> getAll()
    {
        return repository.findAll();
    }

    //    Create a New Record
    public String createEmployee(Employee employee)
    {
        repository.save(employee);
        return "Created!!!!";
    }

    //    Retrieve Employee By specific ID
    public Employee findById(Long id)
    {
        return repository.findById(id).get();
    }

    //    Delete a Record
    public String delete(Long id)
    {
        repository.deleteById(id);
        String message="Deleted the Record with id: "+id;
        return message;
    }

    public String update(Employee employee,Long id)
    {
        Employee e=findById(id);
        e.setName(employee.getName());
        e.setEmail(employee.getEmail());
        repository.save(e);
        return "Employee Updated";
    }

//    Find By Name
    public Employee getByName(String name)
    {
        return repository.findByName(name);
    }

//    Find Employee Record by email
    public Employee getByEmail(String email)
    {
        return repository.findByEmail(email);
    }
}
