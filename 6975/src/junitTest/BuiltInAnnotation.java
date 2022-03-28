package junitTest;
class Annotation1{
	public void method1()
	{
		System.out.println("This is method 1");
	}
	@Deprecated
	public void method2()
	{
		System.out.println("this is method 2");
	}
}
public class BuiltInAnnotation extends Annotation1 {
	@Override
	public void method1() //method name should be same as a parent class 
	{
		System.out.println("Annotation helps to cover the CT error");
	}
	public static void main(String[] args) {
		BuiltInAnnotation obj= new BuiltInAnnotation();
		obj.method1();
		obj.method2(); //indicates not to use this method or implement
		@SuppressWarnings("unchecked")
		int n;
		
	}

}
