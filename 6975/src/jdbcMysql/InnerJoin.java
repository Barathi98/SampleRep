package jdbcMysql;
import java.sql.*;
public class InnerJoin {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///batch6975","root","Barathi@1");
			Statement stmt=con.createStatement();
//            String query="select Orders.OrderId,Customer.CustomerName from Orders inner join Customer on Orders.CustomerId=Customer.CustomerId";
			//inner join with three table
//			String query="SELECT Orders.OrderId,Customer.CustomerName,Shipper.shipperName FROM((Orders INNER JOIN Customer ON Orders.CustomerID=Customer.CustomerId) INNER JOIN Shipper ON Orders.ShipperId=Shipper.ShipperId)";
			String query=" SELECT Customer.CustomerName,Orders.OrderId FROM Customer LEFT JOIN Orders ON Customer.CustomerId=Orders.CustomerId ORDER BY Customer.CustomerName";
			ResultSet result=stmt.executeQuery(query);
//			System.out.println("OrderId      CutomerName      ShipperName");
//			System.out.println("--------------------------------------------");
			while(result.next())
			{
				System.out.println(result.getString(1)+"                      "+result.getInt(2));
			}
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}

	}

}
