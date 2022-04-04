package multiThreading;
class Ant implements Runnable
{
	public void run()
	{
		System.out.println("Thread A is started...");
		for(int i=0;i<=10;i++)
		{
			System.out.println("This is thread A"+i);
		}
		System.out.println("Thread A is Exit");
	}
}
class Ball implements Runnable
{
	public void run()
	{
		System.out.println("Thread A is started...");
		for(int j=0;j<=10;j++)
		{
			System.out.println("This is thread B"+j);
		}
		System.out.println("Thread B is Exit");
	}
}
class Car implements Runnable
{
	public void run()
	{
		System.out.println("Thread C is started...");
		for(int i=0;i<=10;i++)
		{
			System.out.println("This is thread C"+i);
		}
		System.out.println("Thread C is Exit");
	}
}

public class MultithreadingExample2 {

	public static void main(String[] args) {
		Ant a=new Ant();
		Ball b=new Ball();
		Car c=new Car();
		Thread t1=new Thread(a);
		Thread t2=new Thread(b);
		Thread t3=new Thread(c);
		t1.start();
		t2.start();
		t3.start();
		

	}

}
