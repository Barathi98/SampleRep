package entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EmployeeEntity {
	@Id
	private int empId;
	@Column(nullable = false, length = 30)
	private String empName;
	@Column(nullable = false, length = 30)
	private String empPosition;
	@Column(nullable = false, length = 10)
	private long contactNumber;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpPosition() {
		return empPosition;
	}

	public void setEmpPosition(String empPosition) {
		this.empPosition = empPosition;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [empId=" + empId + ", empName=" + empName + ", empPosition=" + empPosition
				+ ", contactNumber=" + contactNumber + "]";
	}

	public EmployeeEntity(int empId, String empName, String empPosition, long contactNumber) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empPosition = empPosition;
		this.contactNumber = contactNumber;
	}

	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

}
