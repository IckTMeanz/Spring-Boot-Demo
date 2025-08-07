package com.example.springBootDemo.Service.iplm;

import com.example.springBootDemo.Entity.Attendance;
import com.example.springBootDemo.Repository.AttendanceDao;
import com.example.springBootDemo.Service.itf.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Service

public class AttendanceServiceIplm implements AttendanceService {
    private AttendanceDao attendanceDao;
    @Autowired
    public AttendanceServiceIplm(AttendanceDao attendanceDao){
        this.attendanceDao=attendanceDao;
    }
    public List<Attendance> findAll(){
        return this.attendanceDao.findAll();
    }
    @Transactional
    public Attendance addAttendance(@RequestBody Attendance attendance){
        this.attendanceDao.save(attendance);
        return attendance;
    }
    @Transactional
    public Attendance updateAttendance(@RequestBody Attendance attendance){
        this.attendanceDao.save(attendance);
        return attendance;
    }
    @Transactional
    public void deleteAttendance(Long id){
        this.attendanceDao.delete(id);
    }

}
