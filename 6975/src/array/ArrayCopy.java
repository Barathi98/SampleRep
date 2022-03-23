package array;

public class ArrayCopy {

	public static void main(String[] args) {
		int ar1[]= {34,25,56,387,264,35};
		int ar2[]=new int[ar1.length];
		System.out.println("The original array is....");
		for(int i=0;i<ar1.length;i++)
		{
			System.out.println(ar1[i]);
		}
		for(int i=0;i<ar1.length;i++)
		{
			ar2[i]=ar1[i];
		}
		System.out.println("The copied array is...");
for(int i=0;i<ar2.length;i++)
{
	System.out.println(ar2[i]);
}
	}

}
