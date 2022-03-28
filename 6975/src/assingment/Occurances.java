package assingment;
//question5 Java program to print the frequency of each character in a string

public class Occurances {

	public static void main(String[] args) {
	String str="welcome in Edubridge family";
	int[]freq= new int [str.length()];
	int i,j;
	char string[]=str.toCharArray();
	for(i=0;i<str.length();i++)
	{
		freq[i]=1;
		for(j=i+1;j<str.length();j++)
		{
			if(string[i]==string[j])
			{
				freq[i]++;
				string[j] = '0';  

			}
		}
	}
	System.out.println("Characters and their occurances");
	for(i=0;i<freq.length;i++)
		if(string[i]!=' ' && string[i]!='0') //skipping spaces and visited string
		{
			System.out.println(string[i]+"="+freq[i]);
		}
	}

}
