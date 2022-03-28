package exceptionHandling;
class UserDefinedExceptions extends Exception 
{
	public UserDefinedExceptions(String msg)
	{
		super(msg);
	}
}
 class EmployeeTest
{
	static void d1(int age) throws UserDefinedExceptions //exception declaration
	{
		if(age<0)
		{
			UserDefinedExceptions obj=new UserDefinedExceptions("Age can't be less than zero");
			throw obj; //throwing an exception
		}
		else
		{
			System.out.println("Input is valid");
		}
	}
	public static void main(String[] args) {
		try {
			d1(-2);
		}
		catch(UserDefinedExceptions e) {
			e.printStackTrace(); //It is a method of throwable class which prints the throwable along with 
			                     //other details like the line number and class name where the exception occurred.
		}

	}

}
 