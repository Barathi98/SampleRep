package manyTomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure();
        SessionFactory sessionFactory=con.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        Customer customer1=new Customer();
        
        customer1.setCustomerId(101);
        customer1.setCustomerName("Barathi");
        Customer customer2=new Customer();
        customer2.setCustomerId(102);
        customer2.setCustomerName("Aruna");
        List <Customer>customerList=new ArrayList<Customer>();
        customerList.add(customer1);
        customerList.add(customer2);
        
        Product product1=new Product();
        product1.setProductId(256);
        product1.setProductName("Milkshake");
        product1.setProductRate(50.0);
        
        Product product2=new Product();
        product2.setProductId(257);
        product2.setProductName("Chocolate");
        product2.setProductRate(500.0);
        List<Product> productList=new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        
        customer1.setProducts(productList);
        customer2.setProducts(productList);
        product1.setCustomers(customerList);
        product2.setCustomers(customerList);
        session.saveOrUpdate(customer1);;
        session.saveOrUpdate(customer2);
//        session.saveOrUpdate(product1);
//        session.saveOrUpdate(product2);
        transaction.commit();
        
        
        
        
	}

}
