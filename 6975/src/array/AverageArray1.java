package array;
//finding the average of array using static method
public class AverageArray1 {
	static int total=0;
public static void sum(int[]a)
{
	for(int i=0;i<a.length;i++)
	{
		total+=a[i];
	}
	System.out.println("Sum of the array is "+total);
	double Average=total/a.length;
	System.out.println("The average of sum of array is "+Average);
}

	public static void main(String[] args) {
		int num[]= {22,33,44,55,66,77,88,99};
		sum(num);
		
	}

}
