package jdbcMysql;

import java.sql.*;

public class AgreegateFunctions {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("Jdbc:mysql:///barathi", "root", "Barathi@1");
			Statement st = con.createStatement();
//		String count="SELECT emp_name, city, COUNT(*) FROM employees GROUP BY city";  
//			String count1="SELECT emp_name, emp_age, COUNT(*) FROM employees GROUP BY emp_age HAVING COUNT(*)>=2 ORDER BY COUNT(*)";
//			String sum=" SELECT emp_id, emp_name, occupation, SUM(working_hours)"
//					+ "FROM employees GROUP BY occupation";
//			String sum1 = "SELECT emp_id, emp_name, occupation,SUM(working_hours) Total_working_hours FROM employees "
//					+ "GROUP BY occupation HAVING SUM(working_hours)>24";
//			String sumDistinct = "SELECT emp_name, occupation,SUM(DISTINCT working_hours) Total_working_hours FROM employees"
//					+ " GROUP BY occupation";
//		String avg="SELECT emp_name, occupation, AVG(working_hours) FROM employees GROUP BY occupation";
//			String avg1="SELECT emp_name, occupation, AVG(working_hours) Avg_working_hours FROM employees "
//					+ "GROUP BY occupation HAVING AVG(working_hours)>9";
//			String min="SELECT emp_name,emp_age, MIN(income) AS Minimum_Income FROM employees GROUP BY emp_age";
//			String min1="SELECT emp_name,city, MIN(income) AS Minimum_Income FROM employees GROUP BY city  HAVING MIN(income) > 150000";
//			String max="SELECT emp_name,emp_age, MAX(income) AS \"Maximum Income\" FROM employees GROUP BY emp_age";
			String max1="SELECT emp_name,city, MAX(income) AS \"Maximum Income\" FROM employees GROUP BY "
					+ "city HAVING MAX(income) >= 200000";
			ResultSet result = st.executeQuery(max1);
			while (result.next()) {
				System.out.println(result.getString(1)+"  "+result.getString(2)+"  "+result.getInt(3));
			}
			System.out.println(result);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
