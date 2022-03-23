package string;
//String manipulation
public class ArrayString {

	public static void main(String[] args) {
  String s="Welcome";
  String b="Welcome";
  String c=" hello ";
  char ch[]= {'t','o'};
  String s1=new String(ch);
  String s2=new String("Java programming");
  System.out.print(s+" ");
  System.out.print(s1+" ");
  System.out.println(s2);
  System.out.println(ch[1]);//retrieving from in array
  System.out.println(s.charAt(6));//retrieving from string
  System.out.println(s.concat(" to java platform"));//Concatenation
  System.out.println(s.equals(b));//true ,the method is boolean
  System.out.println(s2.equalsIgnoreCase("Java programming"));//method type-boolean, true
  System.out.println(s2.equalsIgnoreCase("avja programming"));//method type-boolean, false
  System.out.println(s1.length());//prints the length of the string
  System.out.println(s.replace('e', 'd'));//String replace method
  System.out.println(s.toUpperCase());//method toUpperCase
  System.out.println(s.toLowerCase());//method toLowerCase
  System.out.println(c.trim()+"!!!");//method trim
  String str[]=s2.split("a");
  for(int i=0;i<str.length;i++)
  {
	  System.out.println(str[i]);
  }
  
  String d="Sathish Kumar";
  System.out.println(d.endsWith("Kumar")); //type-Boolean
  System.out.println(d.startsWith("Sathish"));//type-Boolean
  System.out.println(s2.substring(5));
  System.out.println(s2.substring(0, 16));
  System.out.println(s.indexOf('e'));//indexOf method returns the index value of the character at first appearance
  System.out.println(s.lastIndexOf('e'));
  System.out.println(s.compareTo(b)); // type-boolean compares the every literal 
  
	}

}
