package aggregation;

public class EmployeeAgree {
private Address address;
public int id;
public String name;
EmployeeAgree(int id,String name,Address address)
{
	this.id=id;
	this.name=name;
	this.address=address;
}
void display()
{
	System.out.println(id+" "+name+" "+address.address+" "+address.city+" "+address.state);
}
	public static void main(String[] args) {
		Address a=new Address("c-146","chennai","TamilNadu");
		Address a1=new Address("c-147","Coimbatore","Tamilnadu");
        EmployeeAgree emp=new EmployeeAgree(101,"Barathi",a);
        EmployeeAgree emp1=new EmployeeAgree(102,"Surya",a1);
        emp.display();
        emp1.display();
	}

}
