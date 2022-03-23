package array;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[]= {45,32,66,12,27,76,56,52};
		System.out.println("The orginal array elements are.....");
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(arr[i]+" ");
	}
		System.out.println();
		System.out.println("The reversed array elements are.....");
for(int i=arr.length-1;i>=0;i--)
{
	System.out.print(arr[i]+" ");
}
}
}
