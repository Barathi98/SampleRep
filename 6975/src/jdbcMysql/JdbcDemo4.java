package jdbcMysql;

import java.sql.*;
import java.util.Scanner;
class JdbcDemo4
{ public static void main(String args[])
 {
	Scanner sc=new Scanner(System.in);
try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con =DriverManager.getConnection("Jdbc:mysql:///batch6975","root","Barathi@1");
Statement stmt = con.createStatement();
String query = "insert into Student1(id,name,age) values(?,?,?)";
PreparedStatement pstmt = con.prepareStatement(query); 
System.out.println("enter the student id");
int id=sc.nextInt();
System.out.println("enter the student name");
String name=sc.next();
System.out.println("enter the age");
int age=sc.nextInt();
 pstmt.setInt(1,id);
pstmt.setString(2,name);
pstmt.setInt(3, age);
int i = pstmt.executeUpdate();
if(i>0)
{
System.out.println("Inserted");
}
}
catch(Exception e)
{
System.out.println("Exception has occured "+e);
}
}
}
