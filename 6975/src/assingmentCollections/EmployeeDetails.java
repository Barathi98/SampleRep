package assingmentCollections;
/*Create an Employee class with the related attributes and 
behaviours. Create one more class EmployeeDB which has the 
following methods. a. boolean addEmployee(Employee e) b. 
boolean deleteEmployee(int eCode) c. String showPaySlip(int 
eCode) d. Employee[] listAll() Use an ArrayList which will be 
used to store the employees and use enumeration/iterator to 
process the employees. Write a Test Program to test that all 
functionalities are operational
*/
public class EmployeeDetails {
	private int EmpId;
	private String EmpName;
    private String EmpEmail;
    private int EmpAge;
    private float EmpSalary;
    public EmployeeDetails(int empId,String empName,String empEmail,int empAge,float empSalary)
    {
    	super();
        EmpId=empId;
        EmpName=empName;
        EmpEmail=empEmail;
        EmpAge=empAge;
        EmpSalary=empSalary;
    }
    public String getEmployeeDetails()
    {
		return "EmpId="+EmpId+",EmpName="+EmpName+",EmpEmail="+EmpEmail+",EmpAge="+EmpAge+",EmpSalary="+EmpSalary;
    	
    }
    public int getEmpId()
    {
		return EmpId;
    }
    public void setEmpId(int empId)
    {
    	EmpId=empId;
    }
    public String getEmpName()
    {
    	return EmpName;
    }
    public void setEmpName(String empName)
    {
    	EmpName=empName;
    }
    public String getEmpEmail()
    {
    	return EmpEmail;
    }
    public int getEmpAge(int empAge)
    {
    	return empAge;
    }
    public void setEmpAge(int empAge)
    {
    	EmpAge=empAge;
    }
    public float getEmpSalary()
    {
    	return EmpSalary;
    }
    public void setEmpSalary(float empSalary)
    {
    	EmpSalary=empSalary;
    }
    
}
