package multiThreading;
class Multithread extends Thread 
{
	int total=0;
	synchronized public void run()
	{
		for(int i=1;i<=10;i++)
		{
		 total=total+100;
		}
		System.out.println(total);
	}
}
 class SysnchronizationExample2 {

	public static void main(String[] args) {
	Multithread m=new Multithread();
	m.start();
	
	
	}

}
