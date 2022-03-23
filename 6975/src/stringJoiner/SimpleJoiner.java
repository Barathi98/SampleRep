package stringJoiner;

import java.util.StringJoiner;

public class SimpleJoiner {

	public static void main(String[] args) {
	StringJoiner s=new StringJoiner(",","[","]");//delimiter is (,)
	StringJoiner s1=new StringJoiner(":","#","#");
	s.add("Barathi");
    s.add("Surya");
    s.add("Mohammad Shanavas");
    s1.add("manju");
    s1.add("dhiya");
    System.out.println(s);
    StringJoiner merge=s1.merge(s1);
System.out.println(merge);
}
}
