//Constructor overloading
package constructor;

public class Area {
	int area;
	public Area(int a)
	{
		area= a*a;
		System.out.println("---------------------------------------------");
		System.out.println("                  SQUARE              ");
		System.out.println("The side of the square is "+a);
		System.out.println("The area of the square is "+ area);
		System.out.println("---------------------------------------------");
	}
	public Area(int l, int b)
	{
		 area = l*b;
		 System.out.println("                 RECTANGLE            ");
		 System.out.println("The length of the rectangel is "+l+" and breadth is "+b);
		 System.out.println("The area of the rectange is "+area);
		 System.out.println("---------------------------------------------");
	}
	public Area(double pi, int r)
	{
		double area= pi*r;
		 System.out.println("                 CIRCLE            ");
		System.out.println("The value of the pi is "+pi+" and the radius is "+r);
		System.out.println("The area of the circle is "+area);
		System.out.println("---------------------------------------------");
	}
	public static void main(String[] args) {
		Area a1= new Area(6);
		Area a2= new Area(8,4);
		Area a3= new Area(12.5,3);

	}

}
