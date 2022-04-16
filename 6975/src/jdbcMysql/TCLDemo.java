package jdbcMysql;

import java.sql.*;
import java.util.Scanner;

public class TCLDemo {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql:///batch6975","root","Barathi@1");
		con.setAutoCommit(false);
		Statement st=con.createStatement();
		@SuppressWarnings("unused")
		Scanner sc=new Scanner(System.in);
//		String query="create table Employees(id int,name varchar(20),position varchar(30))";
//		String query="insert into employees values(1,'Barathi','developer')";
		String delete_query=" delete from employees where id=1";
		con.setAutoCommit(false);
		Savepoint savepoint1=con.setSavepoint();
		st.executeUpdate(delete_query);
//		System.out.println("Commit/rollback");
//		String answer=sc.next();
//		if(answer.equals("Commit"))
//		{
//			con.commit();
//			System.out.println("records are updated");
//		}
//	   if(answer.equals("rollback"))
//		{
//			con.rollback();
//			System.out.println("records are rollbacked");
//		}
		con.rollback();
		con.commit();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
