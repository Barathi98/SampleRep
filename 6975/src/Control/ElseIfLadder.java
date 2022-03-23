package Control;
import java.util.Scanner;
public class ElseIfLadder {

	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter day between o to 6");
	int day= s.nextInt();
	if (day==0)
	{
		System.out.println("Sunday");
	}
	else if(day==1)
	{
	    System.out.println("Monday");
	}
	else if(day==2) {
		System.out.println("Tuesday");
	}
	else if(day==3)
		{ 
		System.out.println("Wednesday");
		}
	else if(day==4) {
		System.out.println("Thursday");
	}
	else if(day==5) {
		System.out.println("Friday");
	}
	else if(day==6) {
		System.out.println("Saturday");	
	}
		else
			{
			System.out.println("Wrong input");
			}
  }
}

