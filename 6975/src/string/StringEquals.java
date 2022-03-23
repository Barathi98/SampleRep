package string;
//difference between equals method and (==)
public class StringEquals {

	public static void main(String[] args) {
		String str1="Barathi";
		String str2="Barathi";
		String str3=new String("Barathi");
		if(str1.equals(str2))
		{
			System.out.println("The string str1 and str2 are same");
		}
		else
		{
			System.out.println("The String str1 and str2 are not same");
		}
		if(str1==str2)
		{
			System.out.println("The string str1 and str2 are same");
		}
		else
		{
			System.out.println("The String str1 and str2 are not same");
		}
		if(str1.equals(str3))
		{
			System.out.println("The string str1 and str3 are same");
		}
		else 
		{
			System.out.println("The String str1 and str3 are not same");
		}
		if(str1==str3)
		{
			System.out.println("The string str1 and str3 are same");
		}
		else 
		{
			System.out.println("The String str1 and str3 are not same"); //because str3 has different address
		}

	}

}
