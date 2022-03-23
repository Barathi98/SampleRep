package array;
//to check the elements whether the element is present in the array
import java.util.Scanner;

class CheckElement{
	static void check(int arr[],int element)
	{
		for(int n:arr)
		{
			if(element==n)
			{
				System.out.println("element found");
				break;
			}
		
		else
		{
			System.out.println("Element not found!");
		}
			
	}
		
	}
	public static void main(String args[])
	{
		int Arrayof[]= {21,22,23,24,25,26};
	int a;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number you wanna search");
	a=sc.nextInt();
		check(Arrayof,a);
		
	}
	
		
	}


	
	 


