package manyTomany;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Product {
	@Id
	private int productId;
	@Column(nullable=false,length=40)
	private String productName;
	@Column(nullable=false)
	private double productRate;
	@ManyToMany
	private List <Customer> customers;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductRate() {
		return productRate;
	}
	public void setProductRate(double productRate) {
		this.productRate = productRate;
	}
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productRate=" + productRate
				+ ", customers=" + customers + "]";
	}
	public Product(int productId, String productName, double productRate, List<Customer> customers) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productRate = productRate;
		this.customers = customers;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
