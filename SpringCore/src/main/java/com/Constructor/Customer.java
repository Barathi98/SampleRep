package com.Constructor;

import javax.annotation.PostConstruct;

public class Customer
{
 private int customerId;
 private String customerName;
 private int orderId;
public Customer(int customerId, String customerName, int orderId) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.orderId = orderId;
}
@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", orderId=" + orderId + "]";
}
public Customer() {
	super();
	// TODO Auto-generated constructor stub
	
}
 
}
