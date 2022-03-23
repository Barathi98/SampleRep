package operator;

public class ShorthandAssingment {

	public static void main(String[] args) {
		int a=10,b=5, c=20;
		a+=b;
        System.out.println("Addition of a and b= "+a);
        b-=c;
        System.out.println("The value of b-c is "+b);
        c*=a; //a=15 c=20 
        System.out.println("The value of c*a is "+c);
        c/=a;//c=300 a=15
        System.out.println("The final value of c is "+c);
	}

}
