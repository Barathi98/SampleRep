package cacheMemory;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
@Cache(usage =CacheConcurrencyStrategy.READ_ONLY )
@Entity
public class StudentDatabase
{
	@Id
    private int studentId;
	@Column(nullable=false,length=50)
	private String studentName;
	@Column(nullable=false,length=30)
	private String studentDept;
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
	public String getStudentDept() {
		return studentDept;
	}
	public void setStudentDept(String studentDept) {
		this.studentDept = studentDept;
	}
	@Override
	public String toString() {
		return "StudentDatabase [studentId=" + studentId + ", studentName=" + studentName + ", studentDept="
				+ studentDept + "]";
	}
	public StudentDatabase(int studentId, String studentName, String studentDept) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentDept = studentDept;
	}
	public StudentDatabase() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
