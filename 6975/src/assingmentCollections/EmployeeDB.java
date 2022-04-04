package assingmentCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class EmployeeDB 
{
	List<EmployeeDetails> employeeDB=new ArrayList<>();
	public boolean addEmployee(EmployeeDetails e)
	{
		return employeeDB.add(e);
		
	}
	public boolean deleteEmployee(int empId)
	{
		boolean isRemoved=false;
		Iterator<EmployeeDetails>itr=employeeDB.iterator();
		while(itr.hasNext())
		{
			EmployeeDetails emp=itr.next();
			if(emp.getEmpId()==empId)
			{
				isRemoved=true;
				itr.remove();
			}
		}
		return isRemoved;
	}
	public String showPaySlip(int empId)
	{
		String paySlip="Invalid Employee id";
		for(EmployeeDetails e: employeeDB)
		{
			if(e.getEmpId()==empId)
			{
				paySlip="Payslip for Employee id"+empId+" is "+e.getEmpSalary();
			}
		}
		return paySlip;
	}
	public EmployeeDetails[] listAll()
	{
		EmployeeDetails[] empArray=new EmployeeDetails[employeeDB.size()];
		for(int i=0;i<employeeDB.size();i++)
			empArray[i]=employeeDB.get(i);
		return empArray;
	}
}
