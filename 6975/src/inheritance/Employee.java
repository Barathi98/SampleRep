package inheritance;
//hierarchical Inheritance
public class Employee {
	float salary=4000, increment=1000, netsalary;
}
	class Programmer extends Employee{
		public void netamount()
		{
		 netsalary= salary+increment;
		 System.out.println("The netsalary of the programmer is "+ netsalary);
		}
	}
	class Analyst extends Employee
	{
		public void analystSalary()
		{
			float salary=3000;
		netsalary= salary+increment;
		System.out.println("The netsalary of the analyst is "+netsalary);
		}
		
	public static void main(String[] args) 
	{
		Programmer p= new Programmer();
	 Analyst a= new Analyst();
	 p.netamount();
	a.analystSalary();
	 
	}
		
	}


