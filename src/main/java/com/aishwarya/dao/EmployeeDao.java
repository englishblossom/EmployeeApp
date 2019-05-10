package com.aishwarya.dao;
 
import java.util.List;
 
import com.aishwarya.bean.Employee;
 
public interface EmployeeDao {
 public List<Employee> getEmployees();
 public Employee getEmployee(Long employeeId);
 public int createEmployee(Employee employee);
}