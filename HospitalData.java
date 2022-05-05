package practice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class HospitalData {
@Id
private int doctorId;
@Column
private String doctorName;
public int getDoctorId() {
	return doctorId;
}
public void setDoctorId(int doctorId) {
	this.doctorId = doctorId;
}
public String getDoctorName() {
	return doctorName;
}
public void setDoctorName(String doctorName) {
	this.doctorName = doctorName;
}
@Override
public String toString() {
	return "HospitalData [doctorId=" + doctorId + ", doctorName=" + doctorName + "]";
}
public HospitalData(int doctorId, String doctorName) {
	super();
	this.doctorId = doctorId;
	this.doctorName = doctorName;
}
public HospitalData() {
	super();
	// TODO Auto-generated constructor stub
}
	
	
	
}
