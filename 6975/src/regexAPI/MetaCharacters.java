package regexAPI;
import java.util.regex.*;
public class MetaCharacters {

	public static void main(String[] args) {
		System.out.println("metacharacters d....."); //d means digit
        System.out.println(Pattern.matches("\\d","abc"));//false coz abc are not digits
        System.out.println(Pattern.matches("\\d", "1"));//true 1 is a digit
        System.out.println(Pattern.matches("\\d\\d\\d\\d", "4443"));//true given patterns matched
        System.out.println(Pattern.matches("\\d", "4443"));//false pattern doesn't match
        System.out.println(Pattern.matches("\\d", "323abc"));//false digit and char
        System.out.println("metacharacter d with * quantifier");
        System.out.println(Pattern.matches("\\d*", "4556"));
        System.out.println("metacharacters D....");//D means non-digit
        System.out.println(Pattern.matches("\\D", "a"));//true character occurance is one time therefore the pattern matched
        System.out.println(Pattern.matches("\\D", "abc"));//false pattern doesn't matched
        System.out.println(Pattern.matches("\\D\\D\\D", "abc"));//true pattern matched
        System.out.println(Pattern.matches("\\D", "323abc"));//false digit and char
        System.out.println("metacharacters D with quantifier......");
        System.out.println(Pattern.matches("\\D*", "mak"));//true non-digit may come zero or more times
	}

}
