package com.employee.CRUDdemo.dao;

import com.employee.CRUDdemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    void save(Employee employee);
     Employee foundById(Integer id);
     List<Employee> getAllEmployee();
     List<Employee> findByFirstName(String firstName);
     void update(Employee employee);
     void delete(Integer id);
     int deleteAllEmployee();
}
