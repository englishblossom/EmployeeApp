package com.aishwarya.service;
 
import java.util.List;
 
import com.aishwarya.bean.Employee;
 
public interface EmployeeService {
 public List<Employee> getEmployees();
 public Employee getEmployee(Long employeeId);
 public int createEmployee(Employee employee); 
}
