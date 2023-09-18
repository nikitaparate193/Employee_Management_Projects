package com.example.employeeManagement.Employee_Management.service;

import com.example.employeeManagement.Employee_Management.model.EmployeeManagement;
import com.example.employeeManagement.Employee_Management.model.EmployeeReporting;
import com.example.employeeManagement.Employee_Management.model.EmployeeSelfService;
import com.example.employeeManagement.Employee_Management.repository.IEmployeeManagement;
import com.example.employeeManagement.Employee_Management.repository.IEmployeeReporting;
import com.example.employeeManagement.Employee_Management.repository.IEmployeeSelfService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeReportingService {
    @Autowired
    private IEmployeeReporting iEmployeeReporting;
    @Autowired
    private IEmployeeSelfService employeeSelfServiceObj;
    @Autowired
    private IEmployeeManagement employeeManagementObj;

    public String addEmployeeReporting(EmployeeReporting employeeReporting) {
        Integer employeeManagementId = employeeReporting.getEmployeeManagement().getEmployeeId();
        Integer employeeSelfServiceId = employeeReporting.getEmployeeSelfService().getEmployeeServiceId();

        EmployeeManagement employeeManagementobj = employeeManagementObj.findById(employeeManagementId).get();
        EmployeeSelfService employeeSelfServiceobj = employeeSelfServiceObj.findById(employeeSelfServiceId).get();

        employeeReporting.setEmployeeManagement(employeeManagementobj);
        employeeReporting.setEmployeeSelfService(employeeSelfServiceobj);
        iEmployeeReporting.save(employeeReporting);
        return "Employee Reporting added successfully!!";
    }
    public Optional<EmployeeReporting> getEmployeeReporting(Integer id) {
        return iEmployeeReporting.findByReportingId(id);
    }
    @Transactional
    public String putEmployeeReporting(EmployeeReporting employeeReporting) {
        iEmployeeReporting.updateReporting(employeeReporting.getReportingId(),employeeReporting.getEmployeeAttendance(),employeeReporting.getEmployeePerformance());
        return "Reporting updated successfully!!";
    }

    public String deleteEmployeeReporting(Integer id) {
        iEmployeeReporting.deleteById(id);
        return "deleted successfully!!";
    }
}
