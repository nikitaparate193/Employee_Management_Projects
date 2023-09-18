package com.example.employeeManagement.Employee_Management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EmployeeSelfService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeServiceId;
    private String employeeName;
    private String employeeAge;
    private String employeeAddress;
}
