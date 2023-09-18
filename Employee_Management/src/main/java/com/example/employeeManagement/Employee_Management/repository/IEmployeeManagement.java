package com.example.employeeManagement.Employee_Management.repository;

import com.example.employeeManagement.Employee_Management.model.EmployeeManagement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeManagement extends JpaRepository<EmployeeManagement,Integer> {

    @Modifying
    @Query(value = "update employee_management set job_role = :jobRole,salary=:salary where employee_id=:employeeId",nativeQuery = true)
    void updateemp(Integer employeeId, String jobRole, int salary);
}
