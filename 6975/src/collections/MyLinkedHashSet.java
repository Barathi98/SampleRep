package collections;
//unordered elements in insertion order
import java.util.LinkedHashSet;

public class MyLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet <Integer> l= new LinkedHashSet<Integer>();
		l.add(1);
		l.add(1);
		l.add(2);
		l.add(4);
		l.add(3);
		Object array[]=l.toArray();
		for(int i=0;i<4;i++)
        {
	      System.out.println(array[i]);
        }
		

	}

}
