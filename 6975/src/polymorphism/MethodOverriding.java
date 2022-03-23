package polymorphism;
 class College {
	 int x=20;

	public College()  //default constructor
	 {
		 System.out.println("Welcome to ABC college culturals");
	 }
	
	public void culturals() 
	{
		
		System.out.println("This cultural is belongs to all the departments");
	}
}
class Department extends College
{
	public Department(int dept) //parameterized constructor
	{
		System.out.println("There are "+dept+ " departments");
	}
	//@overriding
	public void culturals()
	{
		int x= 19;
		super.culturals();
		System.out.println("Each department contains separate coordinator for all the events");
		System.out.println("The total mark is "+super.x +" marks");
		System.out.println("The department cse is "+x+ " marks");
	}
}
class MethodOverriding{
	public static void main(String[] args) {
		College d= new Department(4);
		d.culturals();
	}

}
