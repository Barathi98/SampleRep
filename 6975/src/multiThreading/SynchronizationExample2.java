package multiThreading;
class Table
{
	synchronized void printTable(int n)
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i*n);
			try {
				Thread.sleep(400);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class Mythread1 extends Thread
{
	Table t;
	public Mythread1(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
	}
}
class Mythread2 extends Thread
{
	Table t;
	public Mythread2(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(100);
	}
}
public class SynchronizationExample2 {

	public static void main(String[] args) 
	{
	 Table obj=new Table();
	 Mythread1 t1=new Mythread1(obj);
	 Mythread2 t2=new Mythread2(obj);
	 t1.start();
	 t2.start();
	}

}
