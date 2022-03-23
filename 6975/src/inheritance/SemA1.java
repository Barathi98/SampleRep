package inheritance;

class SemA1 {
	public SemA1()
	{
		System.out.println("This is a constructor");
	}
	int math, cpp, c;
	void input()
	{
		math=80;
		c=82;
		cpp=89;
	}
	public void output()
	{
		System.out.println("Results of sem-1 \n\n");
		System.out.println("Marks in mathematics "+math);
		System.out.println("Marks in c language "+c);
		System.out.println("Marks in c++ language "+cpp);
		System.out.println("-----------------------------------------------------");
	}
}
class SemA2 extends SemA1
{
	int java,dbms,eng;
	public SemA2()
	{
		System.out.println("SemA2 is a constructor");
		}
	public void input1()
	{
		java=89;
		dbms=80;
		eng=95;
	}
	public void output1()
	{
		System.out.println("Results of sem-2 \n\n");
		System.out.println("Marks in Java "+java);
		System.out.println("Marks in dbms "+dbms);
		System.out.println("Marks in eng "+eng);
		System.out.println("-----------------------------------------------------");
	}
}
class Sem3 extends SemA2
{
	int mis,dm,android;
	public void input2()
	{
		mis=80;
		dm= 88;
		android=79;
	}
	public void output2()
	{
		System.out.println("Results of sem-3 \n\n");
		System.out.println("Marks in mis "+mis);
		System.out.println("Marks in dm "+dm);
		System.out.println("Marks in android "+android);
		System.out.println("-----------------------------------------------------");
	}
}
class MultilevelInheritance{
	public static void main(String[] args) {
	
Sem3 obj = new Sem3();
obj.input();
obj.input1();
obj.input2();
obj.output();
obj.output1();
obj.output2();
	}

}
