package com.example.springBootDemo.Repository;

import com.example.springBootDemo.Entity.Employee;

import java.util.List;

public interface EmployeeDao {
        Employee findById(Long id);
        void save(Employee employee);
        List<Employee> findAll();
        void delete(Long id);
        void update(Employee e);
}
