package com.example.springBootDemo.Repository;


import com.example.springBootDemo.Entity.Attendance;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendanceRepository extends ListCrudRepository<Attendance, Long> {

}
