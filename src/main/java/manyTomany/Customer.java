package manyTomany;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity

public class Customer {
	@Id
	private int customerId;
	@Column(nullable = false, length = 50)
	private String customerName;
	@ManyToMany(targetEntity = Product.class, cascade = { CascadeType.ALL })
	private List<Product> products;

	public int getCustomerId() {
		return customerId;
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

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", products=" + products + "]";
	}

	public Customer(int customerId, String customerName, List<Product> products) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.products = products;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

}
