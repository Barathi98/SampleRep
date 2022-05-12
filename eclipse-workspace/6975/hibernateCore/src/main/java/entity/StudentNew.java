package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentNew
{
	@Id
	private int rollno;
	
	@Column(nullable = false, length = 30)
	private String studentName;
	
	
	@Column(nullable = false, length = 30)
	private String studentDept;
	
	@Column(nullable = false, length = 30)
	private String studentContac;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
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

	public String getStudentContac() {
		return studentContac;
	}

	public void setStudentContac(String studentContac) {
		this.studentContac = studentContac;
	}

	@Override
	public String toString() {
		return "StudentNew [rollno=" + rollno + ", studentName=" + studentName + ", studentDept=" + studentDept
				+ ", studentContac=" + studentContac + "]";
	}

	public StudentNew(int rollno, String studentName, String studentDept, String studentContac) {
		super();
		this.rollno = rollno;
		this.studentName = studentName;
		this.studentDept = studentDept;
		this.studentContac = studentContac;
	}

	public StudentNew() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	}


