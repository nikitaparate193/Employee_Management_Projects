package com.example.employeeManagement.Employee_Management.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EmployeeReporting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reportingId;
    private Integer employeeAttendance;
    private String employeePerformance;
    @OneToOne
    @JoinColumn(name = "employee_management_employee_id")
    private EmployeeManagement employeeManagement;
    @OneToOne
    @JoinColumn(name = "employee_self_service_employee_service_id")
    private EmployeeSelfService employeeSelfService;

}
