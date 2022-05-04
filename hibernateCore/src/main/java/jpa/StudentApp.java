package jpa;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class StudentApp {

	public static void main(String args[])  
    {  
          
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernateCore");  
        EntityManager em=emf.createEntityManager();  
          
em.getTransaction().begin();  
          
        StudentEntity s1=new StudentEntity();  
//        s1.setStudentId(101);  
//       s1.setStudentName("Gaurav");  
//        s1.setAge(23);
          
        StudentEntity s2=new StudentEntity();  
//       s2.setStudentId(102);  
//       s2.setStudentName("Ronit");  
//        s2.setAge(22);
          
        StudentEntity s3=new StudentEntity();  
//        s3.setStudentId(103);  
//        s3.setStudentName("Rahul");  
//          s3.setAge(24);
//          
//        em.persist(s1);  
//        em.persist(s2);  
//        em.persist(s3);      
        Query query=em.createQuery("update StudentEntity set age=:a where studentId=:id");
        query.setParameter("a", 24);
        query.setParameter("id", 103);
       int status= query.executeUpdate();
       System.out.println(status);
     
em.getTransaction().commit();  
          
        emf.close();  
        em.close();  

}
}

