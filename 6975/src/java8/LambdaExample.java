package java8;
@FunctionalInterface
interface A
{
	abstract int add(int x,int y);
	default void substract(int x,int y)
	{
		int c=x-y;
		System.out.println(c);
		
	}
	public static void multiply(int x,int y)
	{
		int result=x*y;
		System.out.println(result);
	}
}
public class LambdaExample {

	public static void main(String[] args) {
		A obj=(int x,int y)->x+y;
		int result=obj.add(2, 3);
		System.out.println(result);
		obj.substract(2, 3);
        A.multiply(2, 3);
	}

}
