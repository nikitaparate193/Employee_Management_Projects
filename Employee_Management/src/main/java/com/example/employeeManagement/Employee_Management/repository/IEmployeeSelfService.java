package com.example.employeeManagement.Employee_Management.repository;

import com.example.employeeManagement.Employee_Management.model.EmployeeSelfService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmployeeSelfService extends JpaRepository<EmployeeSelfService,Integer> {

    List<EmployeeSelfService> findByemployeeServiceId(Integer id);

    @Modifying
    @Query(value = "update employee_self_service set employee_name = :employeeName , employee_age = :employeeAge , employee_address = :employeeAddress where employee_service_id = :employeeServiceId" , nativeQuery = true)
    void updateEmployee(Integer employeeServiceId, String employeeName, String employeeAge, String employeeAddress);

    @Modifying
    @Query(value = "delete from employee_self_service where employee_service_id =:id",nativeQuery = true)
    void deleteByEmployeeServiceId(Integer id);
}
