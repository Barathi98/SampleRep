package multiThreading;
class Table2
{
 synchronized void printTable(int n)
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
public class AnonymousClass {

	public static void main(String[] args) {
	final Table2 obj=new Table2();
	Thread t1=new Thread() {
		public void run()
		{
			obj.printTable(5);
		}
	};
	Thread t2=new Thread() {
		public void run()
		{
			obj.printTable(100);
		}
	};
	t1.start();
    t2.start();
	}

}
