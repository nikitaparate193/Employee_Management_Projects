package com.example.employeeManagement.Employee_Management.controller;

import com.example.employeeManagement.Employee_Management.model.EmployeeReporting;
import com.example.employeeManagement.Employee_Management.model.EmployeeSelfService;
import com.example.employeeManagement.Employee_Management.service.EmployeeReportingService;
import com.example.employeeManagement.Employee_Management.service.EmployeeSelfServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeReportingService employeeReportingService;
    @Autowired
    private EmployeeSelfServiceService employeeSelfServiceServiceService;

    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody EmployeeSelfService employeeObj){
        return employeeSelfServiceServiceService.saveEmployee(employeeObj);
    }

    @GetMapping("/getEmployee/{id}")
    public List<EmployeeSelfService> getEmployee(@PathVariable Integer id){
        return employeeSelfServiceServiceService.getEmployee(id);
    }
    @PutMapping("/putEmployee")
    public String putEmployee(@RequestBody EmployeeSelfService employeeObj){
        return employeeSelfServiceServiceService.putEmployee(employeeObj);
    }
    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable Integer id){
        return employeeSelfServiceServiceService.deleteEmployee(id);
    }

    /////////////////////////////////////////////////////////////////////////////////////////
    @PostMapping("/addEmployeeReporting")
    public String addEmployeeReporting(@RequestBody EmployeeReporting employeeReporting){
        return employeeReportingService.addEmployeeReporting(employeeReporting);
    }
    @GetMapping("/getEmployeeReporting/{id}")
    public Optional<EmployeeReporting> getEmployeeReporting(@PathVariable Integer id){
        return employeeReportingService.getEmployeeReporting(id);
    }
    @PutMapping("/putEmployeeReporting")
    public String putEmployeeReporting(@RequestBody EmployeeReporting employeeReporting){
        return employeeReportingService.putEmployeeReporting(employeeReporting);
    }
    @DeleteMapping("/deleteEmployeeReporting/{id}")
    public String deleteEmployeeReporting(@PathVariable Integer id){
        return employeeReportingService.deleteEmployeeReporting(id);
    }
}
