package exceptionHandling;
class MyException extends Exception
{
	String str1;
	public MyException(String str2)
	{
		str1=str2;
	}
	public String toString()
	{
		return("My Exeception occured"+str1);
	}
}
public class Example1 {

	public static void main(String[] args) {
	
try {
	System.out.println("try block");
	throw new Exception("this is a error message");
}
catch(Exception exp)
{
System.out.println("this is catch block");
System.out.println(exp);
exp.printStackTrace();
}
	}

}
