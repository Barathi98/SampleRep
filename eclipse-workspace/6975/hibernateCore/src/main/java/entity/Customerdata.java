package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customerdata {
@Id
private int customerId;
@Column
private String customerName;
public int getCustomerId() {
	return customerId;
}
public Customerdata() {
	super();
	// TODO Auto-generated constructor stub
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
@Override
public String toString() {
	return "Customerdata [customerId=" + customerId + ", customerName=" + customerName + "]";
}
public Customerdata(int customerId, String customerName) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
}

}
