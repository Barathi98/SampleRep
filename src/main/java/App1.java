

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.EmployeeEntity;
import jakarta.persistence.Query;

public class App1 {

	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure();
		SessionFactory sessionfactory=con.buildSessionFactory();
		Session session=sessionfactory.openSession();
//		Positioned parameter binding
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the employee position");
//		String pos=sc.next();
//		sc.nextLine();
//		System.out.println("Enter the employee name");
//		String name=sc.next();
//		sc.nextLine();
		Transaction tx=session.beginTransaction();
		EmployeeEntity emp=new EmployeeEntity();
//		String hql="Update EmployeeEntity set empId=:Id and empName=:Name";
	    
//		String hql="from EmployeeEntity";
//		String hql = "FROM EmployeeEntity AS E";
//		String hql="select empId from EmployeeEntity";
//		String hql="Select count(E.empId) from EmployeeEntity E";
		//Positioned parameter
//		String hql="from EmployeeEntity emp where emp.empPosition=?1 and emp.empName=?2";
//		//Query query=session.createQuery("Update EmployeeEntity employee set employee.empName=:Name where employee.empId=:Id");
//		Query query=session.createQuery("Update EmployeeEntity employee set employee.empName=?1 where employee.empId=?2");
//		
//		query.setParameter(1, "Nikita");
//		query.setParameter(2, 101);
//		int i=query.executeUpdate();
//		if (i>0)
//		System.out.println("Updated");
//		else
//			System.out.println("NOt updated");
		//PPB
//		query.setParameter(1, pos);
//		query.setParameter(2, name);
//		Criteria cr=session.createc
//		List <EmployeeEntity>list=((org.hibernate.query.Query) query).list();
//		for(EmployeeEntity employee: list)
//		{
//			System.out.println(list);
		//}
//		
		emp=session.get(EmployeeEntity.class, 101);
		System.out.println(emp);
		
		
		
		
		
		
		
//	    emp.setEmpId(102);
//	    emp.setEmpName("Aruna");
//	    emp.setEmpPositon("Developer");
//	    emp.setContactNumber(860545659L);
////	    emp.setEmpId(103);
////	    emp.setEmpName("Archana");
////	    emp.setEmpPositon("Developer");
////	    emp.setContactNumber(1234569872L);
//	    session.save(emp);
	    tx.commit();
	}

}
