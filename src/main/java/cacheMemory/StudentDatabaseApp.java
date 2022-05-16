package cacheMemory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class StudentDatabaseApp {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		StudentDatabase student1=new StudentDatabase();
//		student1.setStudentId(1);
//		student1.setStudentName("Aruna");
//		student1.setStudentDept("computer science");
//		
//		StudentDatabase student2=new StudentDatabase();
//		student2.setStudentId(2);
//		student2.setStudentName("Archana");
//		student2.setStudentDept("Information technology");
//		
//		StudentDatabase student3=new StudentDatabase();
//		student3.setStudentId(3);
//		student3.setStudentName("Nikita");
//		student3.setStudentDept("civil");
//		
//		session.saveOrUpdate(student1);
//		session.saveOrUpdate(student2);
//		session.saveOrUpdate(student3);
//		
//		
//		transaction.commit();
		
//		StudentDatabase record=session.get(StudentDatabase.class, 1);
//		System.out.println(record);
//		
		Session session2=sessionFactory.openSession();
		
		
//		StudentDatabase record2=session2.get(StudentDatabase.class, 1);
//		System.out.println(record2);
		
		Query query1=session.createQuery("from StudentDatabase where studentId=1");
		query1.setCacheable(true);

		query1.uniqueResult();
		System.out.println(query1.toString());
		session.close();
		
		Query query2=session2.createQuery("from StudentDatabase where studentId=1");
		query2.setCacheable(true);
		query2.uniqueResult();
		System.out.println(query2.toString());
		session2.close();
//		
 
	}

}
