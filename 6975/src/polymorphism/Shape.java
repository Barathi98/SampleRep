package polymorphism;
//method overloading

public class Shape {
		public void area(int side) //square
		{
		 int result = side*side;
		 System.out.println("Area of Square is "+result);
		 }
		 public void area(int length, int breadth) //rectangle
		{
		 int result = length*breadth;
		 System.out.println("Area of Rectangle is "+result);
		}
		 public void area(double pi, int r) //circle
		{
		 double result = pi*r*r;
		 System.out.println("Area of Circle is "+result);
		}
		 
	public static void main(String[] args) {
		Shape obj = new Shape();
		 obj.area(10);
		 obj.area(10,20);
		 obj.area(3.14, 6);
	}

}
