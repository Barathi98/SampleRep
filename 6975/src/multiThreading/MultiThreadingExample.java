package multiThreading;
 class A extends Thread
{
	 public void run()
	{
		 for(int i=0;i<5;i++)
		 {
		System.out.println("this thread A-"+i);
	     }
	System.out.println("Thread A Exit");
}
}
 class B extends Thread
 {
 	 public void run()
 	{
 		 for(int j=0;j<5;j++)
 		 {
 		System.out.println("this thread B-"+j);
 	     }
 	System.out.println("Thread B Exit");
 }
 }
 class C extends Thread
 {
 	 public void run()
 	{
 		 for(int k=0;k<5;k++)
 		 {
 		System.out.println("this thread C-"+k);
 	     }
 	System.out.println("Thread C Exit");
 }
 }

public class MultiThreadingExample {

	public static void main(String[] args) {
		MultiThreadingExample m=new MultiThreadingExample();
	    A a=new A();
	    B b=new B();
	    C c=new C();
	    b.setPriority(Thread.MAX_PRIORITY);
	    c.setPriority(Thread.NORM_PRIORITY);
	    a.setPriority(1);
	    a.start();
	    b.start();
	    c.start();
	    

	}

}
