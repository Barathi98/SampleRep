package Control;
import java.util.Scanner;
public class NestedIf {

	public static void main(String[] args) {
	int a,b,c;
	int max=0;
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the Value for a");
	a=s.nextInt();
	System.out.println("Enter the Value for b");
	b=s.nextInt();
	System.out.println("Enter the Value for c");
	c=s.nextInt();
	if(a>b)
	{
		if(a>c)
			max=a;
		else
			max=c;
	}
	else
	{
		if(b>c)
		max=b;
		else
			max=c;
	}
	System.out.println("The maximum value is.."+max);
	}

}
