package java8;

interface Engine1
{
 abstract public void speed(); 
}
class Car1
{
 public void wheel()
 {
 System.out.println("Car has wheels of MRF company");
 }
}
public class MethodReferenceExample2
{
public static void main(String[] args) 
{

 Engine obj = ()->System.out.println("Speed is Good.....");
 obj.speed();

Car1 car1 = new Car1();
Engine1 obj4=car1::wheel;
}
}
