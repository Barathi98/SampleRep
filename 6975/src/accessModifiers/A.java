package accessModifiers;

public class A {
	private int data=40;
	private void msg()
	{
		System.out.println("Welcome to Java"+ data);
	}
}
 class B
{


	public static void main(String[] args) {
		A a=new A();
		System.out.println(A.data); //private

	}

}
