class Base
{
	Base(int var)
	{
		System.out.println("Base");
	}
}

public class SubclassTest extends Base {

	SubclassTest(int var) {
		super(var);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
SubclassTest obj=new SubclassTest(0);
	}

}
