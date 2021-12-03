package com.practice.crud.controller;

import com.practice.crud.model.Employee;
import com.practice.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService service;

//    Retrieve All Records
    @GetMapping("/getAll")
    public List<Employee> getAll()
    {
        return service.getAll();
    }

//    Create a New Record
    @PostMapping("/create")
    public String createEmployee(@RequestBody Employee employee)
    {
       return service.createEmployee(employee);
    }

//    Retrieve Employee By specific ID
    @GetMapping("/get/{id}")
    public Employee getEmployee(@PathVariable Long id)
    {
        return service.findById(id);
    }

//    Delete a Record
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id)
    {
        return service.delete(id);
    }

//    Update Records
    @PutMapping("/update/{id}")
    public String update(@RequestBody Employee employee,@PathVariable Long id)
    {
        return service.update(employee,id);
    }

//    Find By Name
    @GetMapping("/findBy/{name}")
    public Employee getByName(@PathVariable String name)
    {
        return service.getByName(name);
    }

//   Find Employee Record by email
    @GetMapping("/findBy/email/{email}")
    public Employee getByEmail(@PathVariable String email)
    {
        return service.getByEmail(email);
    }
}
