package practice;

public class Pali {

	private static String s;
	private static StringBuilder temp;

	public static void main(String[] args) {

StringBuilder sb= new StringBuilder("madam");

s= sb.toString();
temp=sb.reverse();
System.out.println(s);
System.out.println(temp);
System.out.println(temp.toString());

if(s.equals(temp))
{

	{	System.out.println("This is a palindrom");
	
	}
}


else
{
	System.out.println("this is not a palindrom");
}

	}
	

}


