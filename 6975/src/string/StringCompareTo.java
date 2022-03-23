package string;
//sorting the string in alphabetical order
public class StringCompareTo {
static String arr[]= {"now","is","the","for","all","good","men","to","come","to","the","aid","of","their","country"};
	public static void main(String[] args) {
		for(int j=0;j<arr.length;j++)
		{
			for(int i=j+1;i<arr.length;i++)
			{
				if(arr[i].compareTo(arr[j])<0) //comparing the strings 
						{
					String t=arr[j]; //Swapping the position
					arr[j]=arr[i];
					arr[i]=t;
						}
			}
			System.out.println(arr[j]);
		}

	}

}
