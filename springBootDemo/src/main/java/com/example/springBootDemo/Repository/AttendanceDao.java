package com.example.springBootDemo.Repository;

import com.example.springBootDemo.Entity.Attendance;
import com.example.springBootDemo.Entity.Employee;

import java.util.List;

public interface AttendanceDao {
    void save(Attendance a);
    List<Attendance> findAll();
    void delete(Long id);
    void update(Attendance a);
}
