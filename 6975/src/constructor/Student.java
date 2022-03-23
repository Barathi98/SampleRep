package constructor;

public class Student
{
	int id;
	String name;
	public Student(int id,String name)
	{
		this.id= id;
		this.name= name;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) 
	{
	Student student= new Student(167,"abc");
	Student student1= new Student(168,"def");
	Student student2= new Student(167,"ghi");
	student.display();
	student1.display();
	student2.display();
	}

}
