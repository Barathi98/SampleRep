package array;
//removing the specific element
import java.util.Scanner;

public class RemoveArray {
	
		public static void main(String args[])
		{
			Scanner s= new Scanner(System.in);
			System.out.println("Enter the number of elements");
			int n=s.nextInt();
			Integer arr[]=new Integer[n]; //declaring the array size by user
			System.out.println("enter the elements of array");
			for(int i=0;i<n;i++)
			{
				arr[i]=s.nextInt();
			}
			System.out.println("Enter the element you want to remove");
			int el=s.nextInt();
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==el) //true
				{
					for(int j=i;j<arr.length-1;j++) //shifting the elements
					{
						arr[j]=arr[j+1];
					}
					break;
				}
			}
			System.out.println("The final array elements are");
			for(int i=0;i<arr.length-1;i++)
			{
				System.out.println(arr[i]);
			}
			}
	}



