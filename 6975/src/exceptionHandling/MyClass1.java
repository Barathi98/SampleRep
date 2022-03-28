package exceptionHandling;

public class MyClass1 {
static void checkAge(int age)
{
	if(age<18)
	{
		throw new ArithmeticException("Acess denied-your age must be greater than 17");
	}
	else
	{
		System.out.println("Access granted you are eligible");
	}
}
	public static void main(String args[])
	{
		
		checkAge(15);
	}
}