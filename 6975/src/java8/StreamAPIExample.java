package java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

//1. Java 8 Filter Example: Counting Empty String
//List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
//
//2.Count String whose length is more than three
//
//3. Count number of String which starts with "a"
//
//4.Java 8 Collectors Example: Remove all empty Strings from List
//
//5. Create a List with String more than 2 characters
//
//6. Convert String to uppercase and Join them with coma
//
//7.Create a List of the square of all distinct numbers
//
//8. Get count, min, max, sum, and the average for numbers
//List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
public class StreamAPIExample {

	public static void main(String[] args) {
		List <String> list=Arrays.asList("abc"," ","bcd"," ","defg","jk");
		long count=list.stream().filter(s->s.equals(" ")).count();
		System.out.println(count);
        long count1=list.stream().filter(s->s.length()>3).count();
        System.out.println(count1);
        long count2=list.stream().filter(s->s.startsWith("a")).count();
        System.out.println(count2);
        List<String> list1=list.stream().filter(s->!s.isEmpty()).collect(Collectors.toList());
        System.out.println(list1);
        List<String> list2=list.stream().filter(s->s.length()>2).collect(Collectors.toList());
        System.out.println(list2);
        List<String> list3=list.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(list3);
        List<Integer> list4=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> list5=list4.stream().map(s->s*s).collect(Collectors.toList());
        System.out.println(list5);
        IntSummaryStatistics list6=list4.stream().mapToInt(s->s).summaryStatistics();
        System.out.println(list6);
	}
}
