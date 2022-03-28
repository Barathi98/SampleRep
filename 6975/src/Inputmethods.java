import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Inputmethods {

	public static void main(String[] args) throws NumberFormatException, IOException  {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to add ");
		int sum=sc.nextInt();
		double sum1=sc.nextDouble();
		BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the numbers to multiply");
		int result=Integer.parseInt(inp.readLine());
		String str=inp.readLine();
	}

}
