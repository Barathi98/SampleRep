package practice;

public class PrimeNum {

	public static void main(String[] args) {
		int n=3;
		int i,m, flag=0;
		m=n/2;
		if(n==0||n==1) {
			System.out.println("Not a prime number");
		}
		else
		{
			for(i=2;i<=m;i++)
			{
				if(n%i==0)
					System.out.println("not a prime number");
				flag=1;
				break;
			}
		}
		if(flag==0)
			{
			System.out.println(n+" is a prime number");
			}
			}

}
