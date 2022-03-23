package constructor;

class Square {
	public Square()
	{
		System.out.print("The area of square is ");
	}
	public Square(int x)
	{
		System.out.println(x*x);
}
	public Square(int y, int y1, int y2)
	{
		System.out.println("additon of given number is "+(y+y1+y2));
		System.out.println("multiplication of given number is "+(y*y1*y2));
		}
	public static void main(String[] args) {
		Square s= new Square();
		Square s1= new Square(5);
		Square S2= new Square(1,2,3);
		
	}

}
