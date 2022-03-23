package inheritance;
interface A{
	final int x=30;
	abstract void show();
	abstract void display();
}
interface B
{
	final int x=40;
	abstract void show();
	abstract void display();
}
 class Car
{
	public void speed()
	{
	System.out.println("This is my car");
}
	public void show()
	{
		System.out.println("This is show method");
	}
}
public class MultipleInheritance extends Car implements A,B
{

	public static void main(String[] args) {
		
MultipleInheritance m= new MultipleInheritance();
m.speed();
m.display();
m.show();

	}
public void show()
{
	super.show();
	System.out.println(" This is a show method "+A.x);
	System.out.println(" This is a show method "+B.x);
}

	
	@Override
	public void display() {
		System.out.println("This is display method");
	}
}
