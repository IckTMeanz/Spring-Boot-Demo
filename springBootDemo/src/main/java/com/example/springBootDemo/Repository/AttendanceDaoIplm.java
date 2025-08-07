package com.example.springBootDemo.Repository;

import com.example.springBootDemo.Entity.Attendance;
import com.example.springBootDemo.Entity.Employee;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AttendanceDaoIplm implements AttendanceDao{
    private EntityManager entityManager;
    @Autowired
    public AttendanceDaoIplm(EntityManager entityManager){
        this.entityManager=entityManager;
    }


    @Override
    public void save(Attendance a) {
        this.entityManager.persist(a);
    }

    @Override
    public List<Attendance> findAll() {
        return this.entityManager.createQuery("SELECT e FROM Attendance a", Attendance.class)
                .getResultList();
    }
    @Override
    public void delete(Long id){
        Attendance a = entityManager.find(Attendance.class, id);
        if (a != null) {
            entityManager.remove(a);
        }
    }
    @Override
    public void update(Attendance a){
        this.entityManager.merge(a);
    }
}
