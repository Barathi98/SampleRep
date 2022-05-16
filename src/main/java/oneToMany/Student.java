package oneToMany;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Student 
{
@Id
private int studentId;
@Column(nullable=false,length=40)
private String studentName;
@ManyToOne
private Faculty faculty;
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
public Faculty getFaculty() {
	return faculty;
}
public void setFaculty(Faculty faculty) {
	this.faculty = faculty;
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", faculty=" + faculty + "]";
}
public Student(int studentId, String studentName, Faculty faculty) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.faculty = faculty;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}

}


