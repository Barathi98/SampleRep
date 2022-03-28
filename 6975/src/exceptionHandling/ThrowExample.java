package exceptionHandling;
import java.io.*;
public class ThrowExample {
void mymethod(int num) throws IOException,ClassNotFoundException
{
	
	if(num==1)
	{
		throw new IOException("IO Exception occured");
	}
	else
	{
		throw new ClassNotFoundException("Class not found exception occured");
	}
}
	public static void main(String[] args) 
	{
		
		ThrowExample obj=new ThrowExample();
		try {
			obj.mymethod(1);
		} 
		catch (Exception e) 
		{
			
			e.printStackTrace();
		
		}
		

	}

}
