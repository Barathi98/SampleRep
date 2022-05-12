package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentEntityExample {
@Id
private int studentId;
@Column(nullable=false,length=40)
private String studentName;
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
@Override
public String toString() {
	return "StudentEntityExample [studentId=" + studentId + ", studentName=" + studentName + "]";
}
public StudentEntityExample(int studentId, String studentName) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
}
public StudentEntityExample() {
	super();
	// TODO Auto-generated constructor stub
}

}
