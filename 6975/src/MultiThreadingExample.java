//extends the thread class
class A extends Thread
{
	public void run() //running state
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("This is my A thread"+i);
		}
		System.out.println("A thread is exit");
	}
}
class B extends Thread 
{
	public void run()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int j=0;j<5;j++)
		{
			System.out.println("This is my B thread"+j);
		}
		System.out.println("B thread is exit");
	}
}
public class MultiThreadingExample {

	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		a.start();//new state
		b.start();
		

	}

}
