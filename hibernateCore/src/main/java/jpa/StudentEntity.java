package jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentEntity 
{
 @Id
 private int studentId;
 @Column(nullable=false,length=40)
 private String studentName;
 @Column(nullable=false)
 private int age;
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

@Override
public String toString() {
	return "StudentEntity [studentId=" + studentId + ", studentName=" + studentName + ", age=" + age + "]";
}
public StudentEntity(int studentId, String studentName, int age) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.age = age;
}
public StudentEntity() {
	super();
	// TODO Auto-generated constructor stub
}
 
}
