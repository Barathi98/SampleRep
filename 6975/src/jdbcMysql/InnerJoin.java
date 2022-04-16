package jdbcMysql;
import java.sql.*;
public class InnerJoin {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///batch6975","root","Barathi@1");
			Statement stmt=con.createStatement();
//            String innerjoin="select Orders.OrderId,Customer.CustomerName from Orders inner join Customer on Orders.CustomerId=Customer.CustomerId";
			//inner join with three table
//			String query="SELECT Orders.OrderId,Customer.CustomerName,Shipper.shipperName FROM((Orders INNER JOIN Customer ON Orders.CustomerID=Customer.CustomerId) INNER JOIN Shipper ON Orders.ShipperId=Shipper.ShipperId)";
//			//left join
//			String leftjoin=" SELECT Customer.CustomerName,Orders.OrderId FROM Customer LEFT JOIN Orders ON Customer.CustomerId=Orders.CustomerId ORDER BY Customer.CustomerName";
//			String rightjoin="SELECT Orders.OrderId,Customer.CustomerName,customer.ContactName from orders RIGHT JOIN"
//					+"customer ON Orders.CustomerId=Customer.CustomerId";
//			String crossjoin="SELECT Customer.CustomerName,Shipper.ShipperName from Shipper CROSS JOIN Customer";
			String selfJoin="SELECT A.CustomerName AS CustomerName1,B.CustomerName AS CustomerName2,"
					+ "A.City FROM Customer A,Customer B WHERE A.CustomerId<>B.CustomerId AND A.City=B.City ORDER BY"
					+ " A.City";
			ResultSet result=stmt.executeQuery(selfJoin);
//			System.out.println("OrderId      CutomerName      ShipperName");
//			System.out.println("--------------------------------------------");
			while(result.next())
			{
				System.out.println(result.getString(1)+"------"+result.getString(2)+"------"+result.getString(3));
			}
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}

	}

}
