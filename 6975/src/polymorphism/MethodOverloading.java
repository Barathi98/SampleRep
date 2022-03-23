package polymorphism;
//method overloading
//achieved by two ways changing the no of arguments, argument data type
public class MethodOverloading {
public void add(int a, int b,int c)
{
	int x= a+b+c;
	System.out.println(x);
	}
public void add(int a,int b)
{
	System.out.println(a+b);
}
public void add (double a, double b) 

{
	System.out.println(a+b);
}
	public static void main(String[] args) {
		
		MethodOverloading obj=new MethodOverloading();
		obj.add(1,2,3);
	 obj.add(10,20);
	 obj.add(5.3,6.8);
	}

}
