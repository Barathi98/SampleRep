package com.constructorAutowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Pepsi
{
  private int quantity;
  private double price;
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Pepsi [quantity=" + quantity + ", price=" + price + "]";
}

public Pepsi(int quantity, double price) {
	super();
	this.quantity = quantity;
	this.price = price;
}
public Pepsi() {
	super();
	// TODO Auto-generated constructor stub
}
  
}
