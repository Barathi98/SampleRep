package assingmentCollections;
/*Write a program that will have a Vector which is capable of 
storing emp objects. Use an Iterator and enumeration to list 
all the elements of the Vector.
*/
import java.util.Iterator;
import java.util.Vector;

class EmployeeFresh
{
	int id;
	String name;
	String Address;
	float salary;
	public EmployeeFresh(int id1,String name1,String Address1,float salary1)
	{
		id=id1;
		name=name1;
		Address=Address1;
		salary=salary1;
		
	}
	public String toString()
	{
		return "Employee(id="+id+ ",name="+name+",Address="+Address+",Salary="+salary+")";
		
	}
}
public class Problem8 {

	public static void main(String[] args) {
	Vector<EmployeeFresh> v=new Vector<EmployeeFresh>();
	v.add(new EmployeeFresh(1,"A","Chennai,India",50000F));
	v.add(new EmployeeFresh(2,"B","Chennai,India",45000F));
	v.add(new EmployeeFresh(3,"C","Chennai,India",40000F));
	v.add(new EmployeeFresh(4,"D","Chennai,India",450000F));
	v.add(new EmployeeFresh(5,"E","Chennai,India",30000F));
	v.add(new EmployeeFresh(6,"F","Chennai,India",35000F));
	v.add(new EmployeeFresh(7,"G","Chennai,India",20000F));
	v.add(new EmployeeFresh(8,"H","Chennai,India",25000F));
	v.add(new EmployeeFresh(9,"I","Chennai,India",30000F));
	Iterator obj=v.iterator();
	while(obj.hasNext())
	{
		System.out.println(obj.next());
	}
	
	}

}
