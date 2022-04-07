package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<Integer> p=age->age>18;
		System.out.println(p.test(19));
		System.out.println(p.test(12));
int num[]= {1,2,3,4,5,6,7,8,9,10};
Predicate<Integer> even=x->x%2==0;
Predicate<Integer> grt=y->y>5;
for(int i:num)
{
	if(even.test(i))
	{
		System.out.println(i);
	}
	
}
System.out.println("--------------Or()------------------");
for(int i:num)
{
	if(grt.or(even).test(i))
		System.out.println(i);
}
System.out.println("-------------Static method-----------------");
Predicate<String> place=Predicate.isEqual("Chennai");
System.out.println(place.test("Chennai"));
System.out.println("-------------And()--------------------");
for(int i:num)
{
	if(grt.and(even).test(i)) 
	{
		System.out.println(i);
	}
		
}
System.out.println("-------negate()-------------");
List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
Predicate<Integer> iseven=i->i%2==0;
Predicate<Integer> isOdd = iseven.negate();
List<Integer> evenNum=list.stream().filter(even).collect(Collectors.toList());
List<Integer> oddNum=list.stream().filter(isOdd).collect(Collectors.toList());
System.out.println("This is a list of even numbers");
for(int i:evenNum)
{
	System.out.println(i);
}
System.out.println("This is a list of odd numbers");
for(int i:oddNum)
{
	System.out.println(i);
}

	}

}
