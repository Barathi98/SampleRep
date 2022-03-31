package assingmentString;
import java.util.*;
//removing the duplicate characters
public class Question3 {
	public static void RemoveDuplicate(String str)
	{
		String str1=new String();
		int length=str.length();
		for(int i=0;i<length;i++)
		{
			char charAtPosition=str.charAt(i);
			if(str1.indexOf(charAtPosition)<0)
			{
				str1+=charAtPosition;
			}
		}
		System.out.println(str1);
	}
	public static void main(String args[])
	{
		String str="Welcome to Welcome";
		RemoveDuplicate(str);
	}
}

	
