package assingmentStreamAPI;
//1. Java 8 Filter Example: Counting Empty String
//List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
//3. Count number of String which starts with "a"
//
//4.Java 8 Collectors Example: Remove all empty Strings from List
//
//5. Create a List with String more than 2 characters
//
//6. Convert String to uppercase and Join them with coma
//
//7.Create a List of the square of all distinct numbers

//8. Get count, min, max, sum, and the average for numbers
//List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountingEmptyString {

	public static void main(String[] args) {
		List<String> strList=Arrays.asList("abc","","bcdgs","","defg","ffk");
		long empty=strList.stream().filter(s->s.isEmpty()).count();
		System.out.println(empty);
		long three=strList.stream().filter(s->s.length()>3).count();
        System.out.println(three);
        long count=strList.stream().filter(s->s.startsWith("a")).count();
        System.out.println(count);
        List<String> remove=strList.stream().filter(s-> !s.isEmpty()).collect(Collectors.toList());
        System.out.println(remove);
        List <String>five=strList.stream().filter(s->s.length()>2).collect(Collectors.toList());
        System.out.println(five);
        List<String> six=strList.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(six);
        List<Integer> num=Arrays.asList(2,3,4,5,6,7,8,9);
        List<Integer> seven=num.stream().map(s->s*s).distinct().collect(Collectors.toList());
        System.out.println(seven);
        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        IntSummaryStatistics all=numbers.stream().mapToInt((s)->s).summaryStatistics();
        System.out.println(all);
	}

}
