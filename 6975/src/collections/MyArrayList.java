package collections;
//duplicates elements with ordered elements
//order-insertion order
//not synchronized and not thread safe
//it will increase the size by 50% of the array size
import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args) {
		ArrayList <String> a=new ArrayList <String>(7);
		a.add("Set");
		a.add("Java");
        a.add("List");
        a.add("Is");
        a.add("An");
        a.add(new String("Interface"));
        a.add("Interface");
        System.out.println(a);
        System.out.println(a.get(6));
        System.out.println(a.get(0));
        
	}

}
