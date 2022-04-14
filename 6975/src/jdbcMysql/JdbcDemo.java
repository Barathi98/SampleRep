package jdbcMysql;

import java.sql.*;


public class JdbcDemo {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql:///batch6975","root","Barathi@1");
		Statement st=con.createStatement();
//		String query="create table Student1(id int,name varchar(20),age int)";
//		String query="insert into student1 values(1,'Barathi','23')";
//		int result=st.executeUpdate(query);
		String query="select * from Student1";
		
		
		ResultSet resultSet= st.executeQuery(query);
		while(resultSet.next())
		{
			System.out.println(resultSet.getInt(1)+"      "+resultSet.getString(2));
		}
		
		
		
//		if(result>0)
//		
//			System.out.println("values are added");
//			else
//				System.out.println("values are not added");
//		
		}
catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
	}

}
}
