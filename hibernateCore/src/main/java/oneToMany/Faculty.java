package oneToMany;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Faculty 
{
 @Id
 private int facultyId;
 @Column(nullable=false,length=40,unique=true)
 private String facultyName;
 @OneToMany(mappedBy= "faculty",cascade=CascadeType.ALL )
 private List <Student> students;
public int getFacultyId() {
	return facultyId;
}
public void setFacultyId(int facultyId) {
	this.facultyId = facultyId;
}
public String getFacultyName() {
	return facultyName;
}
public void setFacultyName(String facultyName) {
	this.facultyName = facultyName;
}
public List<Student> getStudents() {
	return students;
}
public void setStudents(List<Student> students) {
	this.students = students;
}
@Override
public String toString() {
	return "Faculty [facultyId=" + facultyId + ", facultyName=" + facultyName + ", students=" + students + "]";
}
public Faculty(int facultyId, String facultyName, List<Student> students) {
	super();
	this.facultyId = facultyId;
	this.facultyName = facultyName;
	this.students = students;
}
public Faculty() {
	super();
	// TODO Auto-generated constructor stub
}

 
}
