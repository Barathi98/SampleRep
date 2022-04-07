package java8;
//forEach method
//stream
//function interface-function
//method reference operator
//lambda expressions
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class IdentityExample1 {

	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("Barathi", "Surya", "Dhiya", "Mohammad", "shanavas", 
				"Preethi", "san");

		list.stream().map(Function.identity()).forEach(System.out::println);//function interface
		System.out.println("************************************");
		list.stream().map(e -> e).forEach(System.out::println);//lambda expressions
	}
}
