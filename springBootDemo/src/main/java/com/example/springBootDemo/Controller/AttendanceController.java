package com.example.springBootDemo.Controller;

import com.example.springBootDemo.Entity.Attendance;
import com.example.springBootDemo.Repository.AttendanceRepository;
import com.example.springBootDemo.Service.itf.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {
    private AttendanceService attendanceService;
    @Autowired
    public AttendanceController(AttendanceService attendanceService){
        this.attendanceService=attendanceService;
    }
    @GetMapping("/all")
    public List<Attendance> findAll(){
        return this.attendanceService.findAll();
    }
    @PostMapping("/add")
    public Attendance addAttendance(@RequestBody Attendance attendance){
        return this.attendanceService.addAttendance(attendance);
    }
    @PutMapping("/update")
    public Attendance updateAttendance(@RequestBody Attendance attendance){
        return this.attendanceService.updateAttendance(attendance);
    }
    @DeleteMapping("/del")
    public void deleteAttendance(Long id){
        this.attendanceService.deleteAttendance(id);
    }
}
