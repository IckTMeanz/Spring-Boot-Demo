package com.example.springBootDemo.Service.itf;

import com.example.springBootDemo.Entity.Attendance;
import com.example.springBootDemo.Repository.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface AttendanceService {


    public List<Attendance> findAll();

    public Attendance addAttendance(Attendance attendance);

    public Attendance updateAttendance(Attendance attendance);

    public void deleteAttendance(Long id);
}
