package com.Crud.Employee.service;

import com.Crud.Employee.Entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    List<Employee> getAllEmployee();
    Employee getEmployee(Long employeeId);
    void deleteEmployee(Long employeeId);
}
