package com.example.springBootDemo.Service.itf;

import com.example.springBootDemo.Entity.Attendance;

import java.util.List;

public interface AttendanceService {


    public List<Attendance> findAll();

    public Attendance addAttendance(Attendance attendance);

    public Attendance updateAttendance(Attendance attendance);

    public void deleteAttendance(Long id);
}
