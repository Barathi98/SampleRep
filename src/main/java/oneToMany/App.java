package oneToMany;

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
    SessionFactory sessionfactory=con.buildSessionFactory();
    Session session=sessionfactory.openSession();
    Transaction transaction=session.beginTransaction();
    Faculty faculty=new Faculty();
    faculty.setFacultyId(1);
    faculty.setFacultyName("Aruna");
    Student student1=new Student();
    student1.setStudentId(101);
    student1.setStudentName("Barathi");
    student1.setFaculty(faculty);
    
    Student student2=new Student();
    student2.setStudentId(102);
    student2.setStudentName("Nikita");
    student2.setFaculty(faculty);
    List <Student>studentlist=new ArrayList<Student>();
    studentlist.add(student1);
    studentlist.add(student2);
    faculty.setStudents(studentlist);
    session.saveOrUpdate(faculty);
//    session.saveOrUpdate(student1);
//    session.saveOrUpdate(student2);
    transaction.commit();
	}

}
