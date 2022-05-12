package entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CustomerApp {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
        Customerdata customer1=new Customerdata();
//        customer1.setCustomerId(1);
//        customer1.setCustomerName("Barathi");
//        session.saveOrUpdate(customer1);
        Customerdata customerget=session.get(Customerdata.class, 2);
        System.out.println(customerget);
        transaction.commit();
	}

}
