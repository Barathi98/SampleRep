package java8;
interface Engine
{
  abstract public void speed();	
}
class Car
{
	public static void average()
	{
		System.out.println("The average speed of the car is very good");
	}
	public void wheel()
	{
		System.out.println("The car wheels are very strong");
	}
	public Car()
	{
		System.out.println("This is a Tesla Model 3");
	}
}
public class MethodReferenceExample1 {

	public static void main(String[] args) 
	{
		Engine obj=()->System.out.println("Speed is good");
        obj.speed();
        Engine obj1=Car::average;
        obj1.speed();
        Car c=new Car();
        Engine obj2=c::wheel;
        Engine obj3=Car::new;
	}

}
