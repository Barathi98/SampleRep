package assingmentCollections;

public class Test {

	public static void main(String[] args) {
		EmployeeDB empDB=new EmployeeDB();
		EmployeeDetails emp1=new EmployeeDetails(1,"Victor","victor@gmail.com",21,20000);
		EmployeeDetails emp2=new EmployeeDetails(2,"Sara","sara@yahoo.com",20,25000);
		EmployeeDetails emp3=new EmployeeDetails(3,"Andy","andy@gmail.com",22,30000);
		EmployeeDetails emp4=new EmployeeDetails(4,"Anna","anna@gmail.com",22,40000);
		EmployeeDetails emp5=new EmployeeDetails(5,"Carlo","carlo@Outlook.com",23,35000);
		empDB.addEmployee(emp1);
		empDB.addEmployee(emp2);
		empDB.addEmployee(emp3);
		empDB.addEmployee(emp4);
		empDB.addEmployee(emp5);
		for(EmployeeDetails emp:empDB.listAll())
		{
			System.out.println(emp.getEmployeeDetails());
			System.out.println();
			empDB.deleteEmployee(2);
		}
			String a=empDB.showPaySlip(3);
			System.out.println(a);
		}
		
		}
	


