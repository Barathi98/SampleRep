package java8;

import java.util.function.Predicate;

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
System.out.println("------------------------------------");
for(int i:num)
{
	if(grt.or(even).test(i))
		System.out.println(i);
}
Predicate<String> place=Predicate.isEqual("Chennai");
System.out.println(place.test("Chennai"));
	}

}
