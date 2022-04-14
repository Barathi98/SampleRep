package jdbcMysql;

import java.sql.*;

public class JdbcExample {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///batch6975", "root", "Barathi@1");
			Statement st = con.createStatement();
//			String query = "create table Customer(customer_id int,name varchar(20),address varchar(30),mobileNumber varchar(10))";
//			String query= "insert into Customer values (3,'pinky','Coimbatore,Tamilnadu','6546466446')";
			String query="select * from Customer";
			ResultSet resultSet = st.executeQuery(query);
			while (resultSet.next())
			{
				System.out.println(resultSet.getInt(1)+"  "+resultSet.getString(2)+"  "+resultSet.getString(3)+"  "+resultSet.getString(4));
			}
//			if (record>0)
//			
//				System.out.println("Successful...");
//			 else 
//			
//				System.out.println("failed!");
			
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch blo
			e.printStackTrace();
		}

	}

}
