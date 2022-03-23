package Control;

public class DoWhile {

	public static void main(String[] args) {
		int i=1;
		int sum=0;
		do
		{
			sum=sum+i; //1,3,6..210
			i++;
		}
while(i<=20);
System.out.println("The sum of 1 to 10 is.."+sum);

}
}
