package assingmentString;

public class MaxOccurance {

	public static void main(String[] args) {
		String str= "welcome in Edubridge family";
		int[] freq=new int[str.length()];
		char minChar=str.charAt(0),maxChar=str.charAt(0);
		int i,j,min,max;
		char ch[]=str.toCharArray(); //converting string to character array
for(i=0;i<ch.length;i++) //counting the words and store in freq
{
	freq[i]=1;
	for(j=i+1;j<ch.length;j++)
	{
		if(ch[i]==ch[j] && ch[i]!=' '&& ch[i]!='0')  //to increase the freq count including space and visited character
	{
			freq[i]++;
			ch[j]='0'; // to ignore visited characters while printing
	}
		
	}
}
	
	min=max=freq[0]; //to determine minimum and maximum occurring characters
	for(i=0;i<freq.length;i++)
	{
		if(min>freq[i]&& freq[i]!='0')
		{
			min=freq[i]; //store minimum occurances
			minChar=ch[i];// stores respective character
		}
		if(max<freq[i])
		{
			max=freq[i];
			maxChar=ch[i];
		}
	}
System.out.println("minimum occuring character is "+minChar);
System.out.println("maximum occuring character is "+maxChar);
}
}
