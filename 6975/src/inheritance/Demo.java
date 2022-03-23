package inheritance;
interface Test1
{
	final int d=22;
	abstract public int area(); /* abstract methods */
	abstract public int volume();  
}
interface Test2
{
	final int d=25;
	public int area2(); //non-abstract method
}
class E
{ 
	public void input()
	{ 
		System.out.println("This is an input method");
	}
	public void output()
	{
		System.out.println("This is an output method");
	}

}

class CProg extends E implements Test1,Test2
{
	int i,j;
	 public int area()
	{
	 i=10;
	 j=20;
	return i*j;
	}
	public int volume()
	{
	 System.out.println("Value of d in test interface "+Test1.d);
	System.out.println("Value of d in test interface "+Test2.d);
	return (i*j*22) ;
	}
	 public int area2()
	 {
	 System.out.println("Area2 is the method of test2 interface ");
	return 0;
	 }
	}


public class Demo {

	public static void main(String[] args) {
		CProg obj= new CProg();
		obj.input();
		obj.output();
		obj.area();
		obj.volume();
		obj.area2();
		}

}
