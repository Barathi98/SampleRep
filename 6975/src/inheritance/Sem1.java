package inheritance;

 public class Sem1 {
	public Sem1()
	{
		System.out.println("Sem1 is a constructor");
	}
	int math,c,cpp;
	 public void input()
	{
		math=80;
		c=85;
		cpp=90;
	}
	public void output()
	{
		System.out.println("Marks in mathematics is "+math);
		System.out.println("Marks in c is "+c);
		System.out.println("Marks in cpp is "+cpp);
		System.out.println("-----------------------------------------");
	}
}

class Sem2 extends Sem1
{
	int java,dbms,toc;
	public void input1()
	{
	java=95;
	dbms=80;
	toc=88;
	}
	public void output1()
	{
		System.out.println("Marks in java is "+java);
		System.out.println("Marks in dbms is "+dbms);
		System.out.println("Marks in toc is "+toc);
		System.out.println("-----------------------------------------");
	}
}
 class SingleInheritance{
	public static void main(String[] args) {
		Sem2 s= new Sem2();
		s.input();
		s.input1();
		s.output();
		s.output1();

	}
}





