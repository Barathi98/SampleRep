package string;

import java.util.Scanner;

class Palindrom
{  
   public static void main(String args[])  
   {  
      String original, reversed = "";   
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a string palindrome");  
      original = in.nextLine();   
      int length = original.length();   
      for ( int i = length-1; i >= 0; i-- ) 
    	  reversed = reversed + original.charAt(i); 
    	  /* "Madam" length=5 index value(i)=0(M),1(A),2(D),3(A),4(M)
    	   * i=4 reversed=0; reversed=M
    	   * i=3 reversed=Ma
    	   * i=2 reversed=Mad
    	   * i=1 reversed=Mada
    	   * i=0 reversed=Madam
    	   */
        
      if (original==reversed)  
         System.out.println("Entered string is a palindrome.");  
      else  
         System.out.println("Entered string isn't a palindrome.");   
   }  
}  