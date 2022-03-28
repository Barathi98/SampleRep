package exceptionHandling;

public class Pubg {
static void Screentime(int age, int screentime) throws Exception
{
	if(age<18)
	{
		if(screentime>6)
		
			throw new Exception("You're reached maximum hours, please take a break and play after time");
	}	
	
	else 
		
			System.out.println("don't forget to take break"); //based on screentime
	}

		
	
	

	public static void main(String[] args) throws Exception {
	
		Screentime(13,7);
	}

}
