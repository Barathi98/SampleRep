package assingmentCollections;
/*
Create an ArrayList of Employee( id,name,address,sal) objects 
and search for particular Employee object based on id number.
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class EmployeeNew implements Comparable <EmployeeNew>
{
	int id;
	String name;
	String address;
	float salary;
	
 @Override
	public String toString() {
		return "EmployeeNew [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
public EmployeeNew(int id,String name,String address,float salary)
 {
	 this.id=id;
	 this.name=name;
	 this.address=address;
	 this.salary=salary;
	 
 }
@Override
public int compareTo(EmployeeNew emp) {
	
	return this.id-emp.id;
}
}
 class Problem5
 {
	public static void main(String[] args) {
		List<EmployeeNew> s=new ArrayList<EmployeeNew>();
		Problem5 p=new Problem5();
		s.add(new EmployeeNew(123,"Rio","Chennai,Tamilnadu",20000F));
		s.add(new EmployeeNew(125,"Surya","Chennai,Tamilnadu",30000F));
		s.add(new EmployeeNew(124,"Barathi","Chennai,Tamilnadu",35000F));
		s.add(new EmployeeNew(126,"San","Coimbatore,Tamilnadu",25000F));
		s.add(new EmployeeNew(122,"Arjun","Mumbai,Maharastra",23000F));
		Collections.sort(s);
		for(EmployeeNew e:s)
		{
			System.out.println(e.id+" "+e.name+" "+e.address+" "+e.address);
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee id you want to search");
		int search=sc.nextInt();
	     
		int flag=0;
		
		for(EmployeeNew e:s)
		{
			if(e.id==search)
			{
				
				flag=1;
				System.out.println(s);
				break;
			}
			//System.out.println(e.id+" "+e.name+" "+e.address+" "+e.address);
		}
		if(flag==1)
		{
			System.out.println("The employee id is found");
		}
		else
		{
			System.out.println("Employee id is invalid, please enter a valid Id");
		}
	}

	
		
	}



