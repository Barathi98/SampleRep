package array;

import java.util.Scanner;

public class ExampleArray {

	public static void main(String[] args) {
int n = 10;
Scanner sc= new Scanner(System.in);
int n1[]= new int[n];
System.out.println("Enter the numbers to be printed");
n=sc.nextInt();
int length= n1.length;
for(int i=0;i<length-1;i++)
{
	System.out.println(n1[i]);
}

	}

}
