package junitTest;
@FunctionalInterface
interface A
{
	void dog();
	
	
}
public class FunctionalInterfaceAnnotation {
	public void dog()
	{
		System.out.println("Dog is a pet animal");
	}

	public static void main(String[] args) {
		FunctionalInterfaceAnnotation f=new FunctionalInterfaceAnnotation();
        f.dog();
	}

}
