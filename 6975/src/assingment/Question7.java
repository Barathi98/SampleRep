package assingment;
//Write a Java program to count how many times the substring
public class Question7 {

	public static void main(String[] args) {
		String str="liveonwildlife";
System.out.println("String: "+str);
int subStrCount=0;
String subString="life"; //subtsring to find
int index=0;
while((index=str.indexOf(subString,index))!=-1)
{
	subStrCount++;
	index=index+subString.length();
}
System.out.println("Substring" +subString +" is found "+subStrCount+" times");
}

}
