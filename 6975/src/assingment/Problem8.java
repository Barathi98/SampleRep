package assingment;
//to check whether the character immediately before and after a specified character is same in a given string.
import java.util.*;
public class Problem8 {
		public boolean leftAndRightSame(String stng) 
		{
		  int l = stng.length();
		  boolean found = true;
		  for (int i = 0; i < l; i++) 
		  {
		    String tmpString = stng.substring(i,i+1);
		    if (tmpString.equals("#") && i > 0 && i < l-1) 
			{
		      if (stng.charAt(i-1) == stng.charAt(i+1))
		        found = true;
		      else
		        found = false;
		    }
		  }
		  return found;
		}
		public static void main (String[] args)
		    {
		      Problem8 m= new Problem8();
		      String str1 =  "moon#night";
		      String str2= "bat##ball";
		      System.out.println("The given string is: "+str1);
		      System.out.println("The given string is: "+str2);
		      System.out.println("The before and after character are same: "+m.leftAndRightSame(str1));
		      System.out.println("The before and after character are same: "+m.leftAndRightSame(str2));
			  }
		}


