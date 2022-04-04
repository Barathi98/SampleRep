package collections;

import java.util.ArrayList;
import java.util.Iterator;

//Example of iterator using array list
public class IteratorExample {

	public static void main(String[] args) {
		ArrayList <String> al=new ArrayList <String>();
		al.add("A");
		al.add("B");
		al.add("c");
		al.add("D");
		Iterator<String> i=al.iterator();
		while(i.hasNext())
		{
			Object element=i.next();
			System.out.println("Element is..."+element);
		}
	}

}
