package com.example.springBootDemo.Service.iplm;

import com.example.springBootDemo.Entity.Attendance;
import com.example.springBootDemo.Repository.AttendanceRepository;
import com.example.springBootDemo.Service.itf.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Service

public class AttendanceServiceIplm implements AttendanceService {
    private AttendanceRepository attendanceRepository;
    @Autowired
    public AttendanceServiceIplm(AttendanceRepository attendanceRepository){
        this.attendanceRepository=attendanceRepository;
    }
    public List<Attendance> findAll(){
        return this.attendanceRepository.findAll();
    }
    @Transactional
    public Attendance addAttendance(@RequestBody Attendance attendance){
        return this.attendanceRepository.save(attendance);
    }
    @Transactional
    public Attendance updateAttendance(@RequestBody Attendance attendance){
        return this.attendanceRepository.save(attendance);
    }
    @Transactional
    public void deleteAttendance(Long id){
        this.attendanceRepository.delete(this.attendanceRepository.findById(id).orElseThrow(()->new RuntimeException("Invalid Id to delete")));
    }

}
