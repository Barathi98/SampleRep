import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import entity.StudentNew;


public class App {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		StudentNew student=new StudentNew();
//		String hql="From StudentNew";
//		String hql="select S.rollno from StudentNew S";
//		String hql="from StudentNew S where S.rollno=2";
//		String hql="from StudentNew student where student.rollno=:rollnumber";
		Query q=session.createQuery("update StudentNew set studentName=:n where rollno=:i");
//		q.setParameter("n","Barathi");
//		q.setParameter("i", "2");
//		Query query=session.createQuery(hql);
		q.setParameter("n","Barathi");
		q.setParameter("i", 1);
		int status=q.executeUpdate();
		System.out.println(status);
		
//		List <StudentNew>results=query.list();
//		System.out.println("Roll no:"+student.getRollno());
//		for(StudentNew student:results)
//		{
//			System.out.println(student);
//		}
//		student.setRollno(2);
//        student.setStudentName("barathi");
//        student.setStudentDept("CSE");
//        student.setStudentContac("Barathi@gmail.com");
//        session.saveOrUpdate(student);
//        session.delete(student);
        transaction.commit();
       
	}

}
