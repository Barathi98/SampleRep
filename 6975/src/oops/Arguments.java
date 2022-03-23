package oops;

public class Arguments {
	int sum;
	void add(int a, int b)
	{
	 sum=a+b;
	}
	void show()
	{
		System.out.println("The sum of 2 numbers is "+ sum);
	}
	

	public static void main(String[] args) {
		Arguments ar= new Arguments();
		ar.add(20, 30);
		ar.show();
	}

}
