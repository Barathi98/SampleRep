package com.setter;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import ReferenceType.Address;

public class Student 
{
  private String studentName;
  private int studentId;
  private String studentDepartment;
  Address address;
  public Address getAddress() {
	return address;
}
public void setAddress(Address address) 
{
	System.out.println("This is setter method");
	this.address = address;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentDepartment() {
	return studentDepartment;
}
public void setStudentDepartment(String studentDepartment) {
	this.studentDepartment = studentDepartment;
}
@Override
public String toString() {
	return "Student [studentName=" + studentName + ", studentId=" + studentId + ", studentDepartment="
			+ studentDepartment + ", address=" + address + "]";
}
public Student() {
	super();
	
}

@PostConstruct
private void start() {
	System.out.println("this is start method");
	
}
@PreDestroy
private void destroy() {
	System.out.println("this is destroy method");
	
}

  
}
