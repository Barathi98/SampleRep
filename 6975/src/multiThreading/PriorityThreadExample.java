package multiThreading;
class A20 extends Thread
{
	public void run()
	{
		System.out.println("Thread A is started");
		for(int i=0;i<10;i++)
		{
			System.out.println("Thread A"+i);
		}
		System.out.println("Exit Thread A");
	}
}
class B20 extends Thread
{
	public void run()
	{
		System.out.println("Thread B is started");
		for(int j=0;j<10;j++)
		{
			System.out.println("Thread B"+j);
		}
		System.out.println("Exit Thread B");
	}
}
class C20 extends Thread
{
	public void run()
	{
		System.out.println("Thread C is started");
		for(int k=0;k<10;k++)
		{
			System.out.println("Thread C"+k);
		}
		System.out.println("Exit Thread C");
	}
}
public class PriorityThreadExample {

	public static void main(String[] args) {
 A threadA=new A();
 B threadB=new B();
 C threadC=new C();
 threadC.setPriority(Thread.MAX_PRIORITY);
 threadB.setPriority(6);
 threadA.setPriority(Thread.MIN_PRIORITY);
 threadA.start();
 threadB.start();
 threadC.start();
 System.out.println("Exit from the main thread");

	}

}
