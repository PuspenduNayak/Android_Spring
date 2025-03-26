package com.puspenduNayak.springServer.controller;


import com.puspenduNayak.springServer.model.employee.Employee;
import com.puspenduNayak.springServer.service.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping("/get-all")
    public List<Employee> getAllEmployees(){
        List<Employee> allEmployee = employeeDao.getAllEmployee();
        int a = 0;
        return allEmployee;
    }

    @PostMapping("/save")
    public ResponseEntity<?> postEmployee(@RequestBody Employee emp){
        Employee save = employeeDao.save(emp);
        return new ResponseEntity<>(save, HttpStatus.OK);
    }
}
