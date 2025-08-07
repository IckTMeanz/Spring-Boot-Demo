package com.example.springBootDemo.Repository;

import com.example.springBootDemo.Entity.Employee;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeDaoIplm implements EmployeeDao{
    private EntityManager entityManager;
    @Autowired
    public EmployeeDaoIplm(EntityManager entityManager){
        this.entityManager=entityManager;
    }
    @Override
    public Employee findById(Long id) {
        return this.entityManager.find(Employee.class, id);
    }

    @Override
    public void save(Employee employee) {
        this.entityManager.persist(employee);
    }

    public List<Employee> findAll() {
        return entityManager.createQuery("SELECT e FROM Employee e JOIN FETCH e.attendances", Employee.class)
                .getResultList();
    }

    @Override
    public void delete(Long id){
        Employee employee = entityManager.find(Employee.class, id);
        if (employee != null) {
            entityManager.remove(employee);
        }
    }
    @Override
    public void update(Employee e){
        this.entityManager.merge(e);
    }
}
