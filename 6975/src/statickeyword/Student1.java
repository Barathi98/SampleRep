package statickeyword;

import constructor.Student;

public class Student1 {
	int rollno;
	String name;
	static String college ="ITS"; //Static variable
	public static void change() //Static method
	{
		college ="BBDIT";
	}
	Student1(int r, String n)
	{
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
		public static void main(String args[]) 
		{
			Student1.change();
			Student1 st=new Student1(1,"Vijay");
			Student1 st1=new Student1(2,"Ajith");
			Student1 st2=new Student1(3,"Surya");
			st.display();
			st1.display();
			st2.display();
		}

	}

