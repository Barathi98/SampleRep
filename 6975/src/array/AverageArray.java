package array;

//without passing array as argument and without static method

public class AverageArray 
{
	static int total=0;
		int a[]= {22,24,6,35,8}; 
		void sum() 
		{
		for(int i=0;i<a.length;i++)
		{
			total+=a[i];
		}

		System.out.println("the sum of the array is "+ total);
}
		void averageof()
		{
			double average=total/a.length;
			System.out.println("The average of the array is "+average);
		}
		public static void main(String args[])
		{
			AverageArray arr= new AverageArray();
			arr.sum();
			arr.averageof();
		}
}