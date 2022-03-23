package exceptionHandling;

public class SimpleException {

	public static void main(String[] args) {
		int a=5,c=0;
		
		try {
			int d=a/c;
			System.out.println(d);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception occured in line number 9"+e);
		}
		System.out.println("Exception is handled successfully");
		
	}

}
