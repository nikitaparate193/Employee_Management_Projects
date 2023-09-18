package com.example.employeeManagement.Employee_Management.repository;

import com.example.employeeManagement.Employee_Management.model.EmployeeReporting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IEmployeeReporting extends JpaRepository<EmployeeReporting,Integer> {

    Optional<EmployeeReporting> findByReportingId(Integer id);

    @Modifying
    @Query(value = "update employee_reporting set employee_attendance =:employeeAttendance , employee_performance = :employeePerformance where reporting_id = :reportingId",nativeQuery = true)
    void updateReporting(Integer reportingId, Integer employeeAttendance, String employeePerformance);
}
