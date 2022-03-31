package assingmentString;
//comparing the strings with ignoring the case
//question 2 upper case and lower case
public class Question1 {

	public static void main(String[] args) {
		String a= "Barathi";
		String b="barathi";
		String c="WELCOME";
		String d="welcome";
		System.out.println("The string 1 is "+a+" & The string 2 is "+b);
int result=a.compareToIgnoreCase(b); //question1
System.out.println(result);
System.out.println("-----------------------------------------");
System.out.println("Upper case and Lower case");
System.out.println(d.toUpperCase());//question2
System.out.println(c.toLowerCase());
	}
}

	
