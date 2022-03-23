package Control;
import java.util.Scanner;

public class IfStatement
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Marks");
		int marks = sc.nextInt();
		if(marks>35)
		{
			System.out.println("Student is passed with"+" "+marks+" "+"marks");
		}
	}
	

}
