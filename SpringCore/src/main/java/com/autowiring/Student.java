package com.autowiring;



public class Student 
{
 private int studentId;
 private String studentName;
 private int studentAge;
 Address address;
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public int getStudentAge() {
	return studentAge;
}
public void setStudentAge(int studentAge) {
	this.studentAge = studentAge;
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
			+ ", address=" + address + "]";
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
	
}
