package regexAPI;
import java.util.regex.*;
public class QuantifiersExample {
public static void main(String args[])
{
	System.out.println("? quantifier.......");
	System.out.println(Pattern.matches("[amn]?", "a"));
	System.out.println(Pattern.matches("[amn]?", "amn"));
	System.out.println(Pattern.matches("[amn]?","aaa"));
	System.out.println(Pattern.matches("[amn]?", "aammmnn"));
	System.out.println(Pattern.matches("[amn]?", "am"));
	System.out.println("+ quantifier.......");
	System.out.println(Pattern.matches("[amn]+", "a"));//true (a or m or n once or more times) 
	System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a comes more than one time)
	System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a or m or n comes more than once) 
	System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)  
	System.out.println("* quantifier ....");  
	System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (a or m or n may come zero or more times)  
	System.out.println(Pattern.matches("[amn]*", "a"));
}
}
