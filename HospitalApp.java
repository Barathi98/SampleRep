package practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HospitalApp {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
         configuration.configure();
         SessionFactory sessionFactory=configuration.buildSessionFactory();
         Session session=sessionFactory.openSession();
         Transaction transaction=session.beginTransaction();
         HospitalData doctor1=new HospitalData(1, "Barathi");
         session.saveOrUpdate(doctor1);
         transaction.commit();
	}

}
