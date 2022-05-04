import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import entity.StudentEntityExample;

public class MainApp {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		StudentEntityExample student1=new StudentEntityExample();
//        student1.setStudentId(101);
//        student1.setStudentName("Barathi");
//        StudentEntityExample student2=new StudentEntityExample();
//        student2.setStudentId(102);
//        student2.setStudentName("Aruna");
        //named parameter binding
//        Query query=session.createQuery("update StudentEntityExample set studentName=:name where studentId=:Id");
      
//        query.setParameter("name", "Archana");
//        query.setParameter("Id", 102);
//        int status=query.executeUpdate();
//       if(status>0)
//       {
//    	   System.out.println("Updated");
//       }
//    	   else {
//    		   System.out.println("Not updated");
//       }
//        session.saveOrUpdate(student1);
//        session.saveOrUpdate(student2);
       //Positioned parameter binding
       Query query=session.createQuery("update StudentEntityExample set studentName=?1 where studentId=?2");
       query.setParameter(1, "Barathi");
       query.setParameter(2, 102);
       int status=query.executeUpdate();
      if(status>0)
      {
   	   System.out.println("Updated");
      }
   	   else {
   		   System.out.println("Not updated");
      }
//       StudentEntityExample getcall=session.get(StudentEntityExample.class, 102);
//       System.out.println(getcall);
        transaction.commit();
	}

}
