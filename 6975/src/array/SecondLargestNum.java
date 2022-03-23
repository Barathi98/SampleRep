package array;
//finding the second largest number in array
public class SecondLargestNum {
public static int secondlargest(int a[], int n )
{
	int temp;
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp; //sorting the array in ascending order
			}
		}
	}
	return a[n-2];
}
	public static void main(String[] args) {
		int a[]= {1,6,5,4,3,2};
		System.out.println("The second largest number is " +secondlargest(a,6));

	}

}
