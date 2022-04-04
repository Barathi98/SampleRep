

class A7 implements Runnable
{
	public void run()
	{
		System.out.println("Thread A is started... ");
		for(int i=0;i<5;i++)
		{
			System.out.println("Thread A"+i);
		}
	}
}
class Ball implements Runnable
{
   public void run()
   {
	   System.out.println("Thread B is started");
	   for(int j=0;j<5;j++)
	   {
		   System.out.println("Thread B"+j);
	   }
   }
}
public class MultiThreadingExample2 {
	public static void main(String[] args) {
		A7 a= new A7();
		Ball b=new Ball();
		Thread t1=new Thread(a);
		Thread t2=new Thread(b);
		t1.start();
		t2.start();

	}

}
