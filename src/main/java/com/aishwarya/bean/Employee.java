package com.aishwarya.bean;
 
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
 
@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee {
 
 private Long employeeId;
 private String firstName;
 private String lastName;
 private Long age;
 private Long salary;
 @JsonCreator
 public Employee(@JsonProperty("employeeId") Long employeeId, @JsonProperty("firstName") String firstName,
   @JsonProperty("lastName") String lastName, @JsonProperty("age") Long age,@JsonProperty("salary") Long salary) {
  this.employeeId = employeeId;
  this.firstName = firstName;
  this.lastName = lastName;
  this.age = age;
  this.salary=salary;
 }
 
 public Employee() {
 
 }
 
 public Long getEmployeeId() {
  return employeeId;
 }
 
 public void setEmployeeId(Long employeeId) {
  this.employeeId = employeeId;
 }
 
 public String getFirstName() {
  return firstName;
 }
 
 public void setFirstName(String firstName) {
  this.firstName = firstName;
 }
 
 public String getLastName() {
  return lastName;
 }
 
 public void setLastName(String lastName) {
  this.lastName = lastName;
 }
 
 public Long getAge() {
  return age;
 }
 
 public void setAge(Long age) {
  this.age = age;
 }
 public Long getSalary() {
	  return salary;
	 }
	 
	 public void setSalary(Long salary) {
	  this.salary = salary;
	 }
	 
 
 @Override
 public String toString() {
  StringBuilder str = new StringBuilder();
  str.append("Employee Id:- " + getEmployeeId());
  str.append(" First Name:- " + getFirstName());
  str.append(" Last Name:- " + getLastName());
  str.append(" Age:- " + getAge());
  str.append(" Salary:- " + getSalary());
  return str.toString();
 }
 
}