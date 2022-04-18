package regexAPI;
import java.util.regex.*;
public class CharacterClassRegex 
{
public static void main(String args[])
{
	System.out.println(Pattern.matches("[amn]", "abcd"));//false not a or m or n a does not continue with m or n
	System.out.println(Pattern.matches("[amn]", "a"));//true matches string 'a' at starting index
	System.out.println(Pattern.matches("[amn]", "ammmna"));
}
}
