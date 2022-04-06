package multiThreading;
class Table3
{
	public void printTable(int n)
	{
		synchronized(this)
		{
			for(int i=0;i<=10;i++)
			{
				System.out.println(i*n);
				try
				{
					Thread.sleep(400);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}
	}
}
class NewThread1 extends Thread
{
	Table3 t;
	public NewThread1(Table3 t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
	}
}
class NewThread2 extends Thread
{
	Table3 t;
	public NewThread2(Table3 t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(100);
	}
}
public class SynchronizedBlock {

	public static void main(String[] args) {
		Table3 obj=new Table3();
		NewThread1 t1= new NewThread1(obj); 
		NewThread2 t2=new NewThread2(obj);
		t1.start();
		t2.start();
	}

}
