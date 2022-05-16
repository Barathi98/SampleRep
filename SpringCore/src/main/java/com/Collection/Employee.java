package com.Collection;

import java.util.*;

public class Employee 
{
 private Set<Integer> employeeId;
 private List<String> employeeName;
 private Map<Integer,String> employeeDetail;
public Set<Integer> getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(Set<Integer> employeeId) {
	this.employeeId = employeeId;
}
public List<String> getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(List<String> employeeName) {
	this.employeeName = employeeName;
}
public Map<Integer, String> getEmployeeDetail() {
	return employeeDetail;
}
public void setEmployeeDetail(Map<Integer, String> employeeDetail) {
	this.employeeDetail = employeeDetail;
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDetail="
			+ employeeDetail + "]";
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

 

}
