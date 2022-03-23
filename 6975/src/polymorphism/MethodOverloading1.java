package polymorphism;
//using return type
public class MethodOverloading1 {
	public static int  add(int a, int b,int c)
	{
		int x= a+b+c;
		return x;
		}
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int add (int a) 

	{
		return a;
	}
		public static void main(String[] args) {
			
			System.out.println(MethodOverloading1.add(5,10,15));
			System.out.println(MethodOverloading1.add(2, 4));
			System.out.println(100);
		}

	}


