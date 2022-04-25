package java8;
interface MyLambda{
	public String test();
}
public class LambdaExpression {

	public static void main(String[] args) {
		MyLambda l=()->{return "Good luck";
        
	};
System.out.println(l.test());
}
}
