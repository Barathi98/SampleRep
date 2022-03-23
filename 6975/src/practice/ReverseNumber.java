package practice;

public class ReverseNumber {

	public static void main(String[] args) {
		int number= 86089, reverse=0;
		while(number!=0)
		{
			int reminder= number%10;
			reverse= reverse * 10 + reminder;
			number= number/10;
		}
			System.out.println("the reversed number is "+ reverse);
	}

}
