package criteria;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeData {
@Id
private int employeeId;
@Column(nullable=false,length=40)
private String employeeName;
@Column(nullable=false,length=60)
private String email;
@Column(nullable=false)
private long contactNumber;
@Column(nullable=false,length=50)
private String designation;
@Column(nullable=false)
private double salary;
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getContactNumber() {
	return contactNumber;
}
public void setContactNumber(long contactNumber) {
	this.contactNumber = contactNumber;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "EmployeeData [employeeId=" + employeeId + ", employeeName=" + employeeName + ", email=" + email
			+ ", contactNumber=" + contactNumber + ", designation=" + designation + ", salary=" + salary + "]";
}
public EmployeeData(int employeeId, String employeeName, String email, long contactNumber, String designation,
		double salary) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.email = email;
	this.contactNumber = contactNumber;
	this.designation = designation;
	this.salary = salary;
}
public EmployeeData() {
	super();
	// TODO Auto-generated constructor stub
}

}
