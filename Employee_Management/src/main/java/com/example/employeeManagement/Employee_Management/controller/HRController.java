package com.example.employeeManagement.Employee_Management.controller;

import com.example.employeeManagement.Employee_Management.model.EmployeeManagement;
import com.example.employeeManagement.Employee_Management.service.EmployeeManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HRController {

    @Autowired
    private EmployeeManagementService employeeManagementService;

    @PostMapping("/addEmployeeSalary")
    public String addEmployeeSalary(@RequestBody EmployeeManagement employeeManagementObj){
        return employeeManagementService.addEmployeeSalary(employeeManagementObj);
    }
    @GetMapping("/getEmployeeSalary/{id}")
    public EmployeeManagement getEmployeeSalary(@PathVariable Integer id){
        return employeeManagementService.getEmployeeSalary(id);
    }

    @PutMapping("/putEmployeeSalary")
    public String putEmployeeSalary(@RequestBody EmployeeManagement employeeManagementObj){
        return employeeManagementService.putEmployeeSalary(employeeManagementObj);
    }
    @DeleteMapping("/deleteEmployeeSalary/{id}")
    public String deleteEmployeeSalary(@PathVariable Integer id){
        return employeeManagementService.deleteEmployeeSalary(id);
    }
}
