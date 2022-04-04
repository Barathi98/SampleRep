package Project;

import java.util.ArrayList;

class Employee10{
	int id;
	String Name;
	String Address;
	long Mobile_Number;
	String Email_id;
	public Employee10(int id,String Name,String Address,long Mobile_Number,String Email_id)
	{
		this.id=id;
		this.Name=Name;
		this.Address=Address;
		this.Mobile_Number=Mobile_Number;
		this.Email_id=Email_id;
	}
	public String toString()
	{
		return "\nEmployee Details :" + "\nID: " + this.id + "\nName: " + this.Name +
				"\nMobile Number: " + this.Mobile_Number + "\nEmail-id: " + this.Email_id;
		
	}
	
}
public class EmployeeManagement {
	static void display(ArrayList<Employee10>list)
	{
		System.out.println("***************Employee List)***************");
		for(Employee10 e:list)
		{
			System.out.println("ID:"+e.id+ "Name:"+e.Name+"Mobile Number:"+e.Mobile_Number+"Email Id:"+e.Email_id);
			
		}
	}
	

	public static void main(String[] args) {
		
		int id;
		String Name;
		String Address;
		long Mobile_Number;
		String Email_id;
		
		

	}

}
