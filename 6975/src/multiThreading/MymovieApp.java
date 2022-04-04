package multiThreading;

 class BookMyShow{
	int TotalTickets=10;
	
	synchronized public void booktickets(int RequestTicket)
	{
		
	
		if(TotalTickets>=RequestTicket)
		{
			TotalTickets=TotalTickets-RequestTicket;
			System.out.println(Thread.currentThread().getName() +" has booked "+RequestTicket+ " tickets and the remaining tickets are " +TotalTickets);
		}
		
		else
		{
			System.out.println("Sorry there is only " +TotalTickets+" are remaining");	
	   }
	}
 }
 
	public class MymovieApp extends Thread 
	{
		BookMyShow bookMyShow;
		int bookticket;
		public MymovieApp(BookMyShow book) 
		{
		bookMyShow=book;
		
		}
		public void run()
		{
			bookMyShow.booktickets(bookticket);
		}
	public static void main(String[] args) {
		
		BookMyShow book=new BookMyShow();
		MymovieApp thread1=new MymovieApp (book);
		thread1.setName("person 1");
		thread1.bookticket=4;
		thread1.start();
		MymovieApp thread2=new MymovieApp(book);
		thread2.setName("person 2");
		thread2.bookticket=4;
		thread2.start();
		MymovieApp thread3=new MymovieApp(book);
		thread3.setName("person 3");
		thread3.bookticket=3;
		thread3.start();
		

	}
	}


