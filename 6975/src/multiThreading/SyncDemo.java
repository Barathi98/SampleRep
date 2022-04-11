package multiThreading;

class Sender
{
	public void send(String msg)
	{
		System.out.println("sending\t"+ msg);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception a)
		{
			System.out.println("Thread interuppted");
		}
		System.out.println("\n"+ msg +"sent");
	}
}
class ThreadSend extends Thread
{
	private String msg;
	Sender sender;
ThreadSend(String m,Sender obj) 
{
	msg=m;
	sender=obj;
}
	public void run()
	{
		synchronized(sender)
		{
			sender.send(msg);
		}
	}
}
class ThreadSend2 extends Thread
{
	private String msg;
	Sender sender;
	ThreadSend2(String m,Sender obj)
	{
		msg=m;
		sender=obj;
	}
	public void run()
	{
		synchronized(sender)
		{
			sender.send(msg);
		}
	}
}
public class SyncDemo {

	public static void main(String[] args) {
		Sender send=new Sender();
		ThreadSend t1=new ThreadSend ("Hi",send);
        ThreadSend t2=new ThreadSend("Bye",send);
        ThreadSend2 t3=new ThreadSend2("Hello",send);
        ThreadSend2 t4=new ThreadSend2("hehe",send);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        try {
        	t1.join();
        	t2.join();
        	t3.join();
        	t4.join();
        }
        catch(Exception e)
        {
        	System.out.println("Interrupted");
        }
	}

}
