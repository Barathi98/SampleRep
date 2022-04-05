package Project;

import java.util.ArrayList;
import java.util.Scanner;

class Employee10{
	int id;
	String Name;
	String Address;
	long Mobile_Number;
	String Email_id;
	public Employee10(int id,String Name,String Address,long Mobile_Number, String Email_id)
	{
		this.id=id;
		this.Name=Name;
		this.Address=Address;
		this.Mobile_Number=Mobile_Number;
		this.Email_id=Email_id;
	}
	public String toString()
	{
		return "\nEmployee Details :" + "\nID: " + this.id + "\n Name: " + this.Name +
				"\n Mobile Number: " + this. Mobile_Number + "\n Email-id: " + this.Email_id;
		
	}
	
}
public class EmployeeManagement {
	static void display(ArrayList<Employee10>list)
	{
		System.out.println("***************Employee List***************");
		for(Employee10 e:list)
		{
			System.out.println("\nID: "+e.id+"  "+"\nName: "+e.Name+"  "+"\nMobile Number: "+e.Mobile_Number+"  "+"\nEmail-Id: "+e.Email_id);
			
		}
	}
	

	public static void main(String[] args) {
		
		int id;
		String Name;
		String Address;
		long Mobile_Number;
		String Email_id;
		Scanner sc=new Scanner(System.in);
		ArrayList<Employee10> al=new ArrayList<Employee10>();
		do
		{
			System.out.println("*****************************Welcome to Employee Management*****************************");
			System.out.println("1. Add Employee to the DataBase\n"+"2. Search for an Employee\n"+"3. Edit Employee Details\n"+
			"4. Delete Employee Details\n"+"5. Display all the Employee Details\n"+"6. Exit\n");
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:System.out.println("Enter the following details to add an employee:");
			System.out.println("Enter employee Id");
			id=sc.nextInt();
			System.out.println("Enter Name");
			Name=sc.next();
			System.out.println("Enter Address");
			Address=sc.next();
			System.out.println("Enter the mobile number");
			Mobile_Number=sc.nextLong();
			System.out.println("Enter email-id");
			Email_id=sc.next();
			al.add(new Employee10(id,Name,Address,Mobile_Number,Email_id));
			display(al);
			break;
			case 2:System.out.println("Enter the Employee Id to search:");
			id=sc.nextInt();
			int i=0;
			for(Employee10 e:al)
			{
				if(id==e.id);
				{
					System.out.println(e+"\n");
					i++;
				}
			}
			if(i==0)
			{
				System.out.println("\n please enter a valid Id");
			}
			break;
			case 3:System.out.println("\nEnter employee id to edit the details");
			id=sc.nextInt();
			int j=0;
			for(Employee10 e:al)
			{
				if(id==e.id)
				{
					j++;
					do
					{
						int ch1=0;
						System.out.println("\nEdit Employee Details :\n"+"1. Employee Id\n"+"2. Name\n"+"3. Address\n"+"4. Mobile number\n"+
						"5. Email-id\n"+"6. Go Back\n");
						System.out.println("Enter you choice: ");
						ch1=sc.nextInt();
						switch(ch1)
						{
						case 1:System.out.println("Enter a new Employee Id");
						e.id=sc.nextInt();
						System.out.println(e+"\n");
						break;
						case 2:System.out.println("Enter new Employee Name");
						e.Name=sc.next();
						System.out.println(e+"\n");
						break;
						case 3:System.out.println("Enter new Employee's Address");
						e.Address=sc.next();
						System.out.println(e+"\n");
						break;
						case 4:System.out.println("Enter the new mobile number");
						e.Mobile_Number=sc.nextLong();
						System.out.println(e+"\n");
						break;
						case 5:System.out.println("Enter the new mail id");
						e.Email_id=sc.next();
						System.out.println(e+"\n");
						break;
						case 6:j++;
						break;
						default:System.out.println("\n please select a valid option from the list");
						break;
						}
					}
					while(j==1);
				}
			}
			if(j==0)
			{
				System.out.println("\n Please Enter a valid employee id");
			}
			break;
			case 4:System.out.println("\nEnter Employee Id to delete from the database: ");
			 id=sc.nextInt();
			 int k=0;
			 for(Employee10 e:al)
			 {
			   if(id==e.id)
			   {
				   al.remove(e);
				   display(al);
				   k++;
			   }
			}
			 if(k==0)
			 {
				 System.out.println("\n Please Enter a valid Employee Id");
			 }
			 break;
			case 5:System.out.println("\nEmployee Details..... ");
			display(al);
			break;
			case 6:System.out.println("\n You have choosen Exit!! Saving your files and closing the application:)");
			sc.close();
			System.exit(0);
			break;
			default:System.out.println("\nEnter a correct choice from the list");
			break;
		}

	}
		while(true);
}
}
