package com.aishwarya.controller;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 
import com.aishwarya.bean.Employee;
import com.aishwarya.service.EmployeeService;
 
@RestController
public class EmployeeController {
 
 @Autowired
 private EmployeeService employeeService;
 
 @RequestMapping(value = "/employee", method = RequestMethod.GET, produces = "application/json")
 public ResponseEntity<List<Employee>> employees() {
 
  HttpHeaders headers = new HttpHeaders();
  List<Employee> employees = employeeService.getEmployees();
 
  if (employees == null) {
   return new ResponseEntity<List<Employee>>(HttpStatus.NOT_FOUND);
  }
  headers.add("Number Of Records Found", String.valueOf(employees.size()));
  return new ResponseEntity<List<Employee>>(employees, headers, HttpStatus.OK);
 }
 
 @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
 public ResponseEntity<Employee> getEmployee(@PathVariable("id") Long employeeId) {
  Employee employee = employeeService.getEmployee(employeeId);
  if (employee == null) {
   return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
  }
  return new ResponseEntity<Employee>(employee, HttpStatus.OK);
 }
  
 @RequestMapping(value = "/employee", method = RequestMethod.POST,produces = "application/json")
 public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
  HttpHeaders headers = new HttpHeaders();
  if (employee == null) {
   return new ResponseEntity<Employee>(HttpStatus.BAD_REQUEST);
  }
  employeeService.createEmployee(employee);
  headers.add("Employee Created  - ", String.valueOf(employee.getEmployeeId()));
  return new ResponseEntity<Employee>(employee, headers, HttpStatus.CREATED);
 }
 

 
}
 