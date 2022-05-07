package criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;

public class CriteriaProjection {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure();
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Criteria criteria=session.createCriteria(EmployeeData.class);
		//criteria.setProjection(Projections.rowCount());
		//criteria.setProjection(Projections.avg("salary"));
		//criteria.setProjection(Projections.max("salary"));//internally comparing the values
		//criteria.setProjection(Projections.min("salary"));
		//criteria.setProjection(Projections.sum("salary"));
		criteria.setProjection(Projections.countDistinct("employeeName"));
		List list=criteria.list();
		System.out.println(list);
		
	}

}
