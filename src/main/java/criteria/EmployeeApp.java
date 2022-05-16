package criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class EmployeeApp {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure();
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
//		EmployeeData employee1=new EmployeeData(1, "Barathi", "barathi@gmail.com", 8608967899L, "Developer", 25000.00);
//		EmployeeData employee2=new EmployeeData(2, "Aruna", "aruna@gmail.com", 8608965999L, "Developer", 25000.00);
//		EmployeeData employee3=new EmployeeData(3, "Archana", "archana@gmail.com", 8608996899L, "Testing Engineer", 20000.00);
//		EmployeeData employee4=new EmployeeData(4, "Nikita", "nikita@gmail.com", 7608967899L, "Senior Developer", 28000.00);
//		EmployeeData employee5=new EmployeeData(5, "Surya", "surya@gmail.com", 66089678569L, "Manager", 30000.00);
//		EmployeeData employee6=new EmployeeData(6, "Manjula", "manju@gmail.com", 9094386650L, "Assistant manager", 28000.00);
//		session.saveOrUpdate(employee1);
//		session.saveOrUpdate(employee2);
//		session.saveOrUpdate(employee3);
//		session.saveOrUpdate(employee4);
//		session.saveOrUpdate(employee5);
//		session.saveOrUpdate(employee6);
		Criteria criteria=session.createCriteria(EmployeeData.class);
		/*
		            Restrictions
		*/
//		List<EmployeeData>list=criteria.list();
//		for(EmployeeData data:list)
//		{
//			System.out.println(data);
//		}
//      criteria.setFirstResult(2); //exclusive-index
//      criteria.setMaxResults(4);//inclusive-index
//      List <EmployeeData>list2=criteria.list();
//      for(EmployeeData data:list2)
//      {
//      System.out.println(data);
//      }
     criteria.add(Restrictions.gt("salary", 20000.00));
     criteria.addOrder(Order.asc("employeeName"));
     criteria.setFirstResult(2);
   criteria.setMaxResults(2);
     List <EmployeeData> gt=criteria.list();
     for(EmployeeData data:gt)
     {
    	 System.out.println(data);
     }
     
     
		transaction.commit();
	}

}
