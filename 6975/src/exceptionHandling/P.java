package exceptionHandling;

public class P {
	static void methodA(int age,int screentime) throws Exception
	{
		if(age<18)
		{
			if(screentime>6)
			{
				throw new Exception("You are not able to continue anymore, please take a break");
			}
		}

           else	
			{
		System.out.println(" Don't forget to take a break");
            }
}
	

	public static void main(String[] args) throws Exception {

		methodA(18, 7);
	}

}
