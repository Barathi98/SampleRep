import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		String un="Barathi";
		int password=1998;
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the username");
        String username=sc.next();
        System.out.println("Enter the password");
        int password1=sc.nextInt() ;
        if((un.equals(username)) && (password==password1))
        {
        	System.out.println("logged in successfully....");
        }
        else 
        	
        	System.out.println("Invalid password or username");
	}
}
