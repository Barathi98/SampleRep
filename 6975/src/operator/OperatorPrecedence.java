package operator;

public class OperatorPrecedence {

	public static void main(String[] args) {
		int a=20,b=10,c;
		c= a-b*a/b+b%a;
		System.out.println("The result is "+c);
		}

}
