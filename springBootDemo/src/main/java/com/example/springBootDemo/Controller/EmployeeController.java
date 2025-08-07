package com.example.springBootDemo.Controller;

import com.example.springBootDemo.Entity.Employee;
import com.example.springBootDemo.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;
    }
    @GetMapping("")
    public List<Employee> findAll(){
        return this.employeeRepository.findAll();
    }
    @GetMapping("/{id}")
    public Employee findById(@PathVariable Long id){
        return this.employeeRepository.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Deo thay"));
    }




}
