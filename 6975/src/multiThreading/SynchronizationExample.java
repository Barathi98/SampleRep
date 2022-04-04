package multiThreading;
class TotalEarnings extends Thread
{
	int total=0;
	public void run() {
		synchronized(this)
		{
			for(int i=1;i<=10;i++)
			{
				total=total+100;
			}
			this.notify();
		}
	}
}
public class SynchronizationExample {

	public static void main(String[] args) 
	{
		TotalEarnings obj=new TotalEarnings();
		obj.start();
		synchronized(obj)
		{
			try
			{
				obj.wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("Total Earning is "+obj.total);
		}

	}

}
