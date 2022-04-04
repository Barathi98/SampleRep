package collections;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class MySortedSet {

	public static void main(String[] args) {
	SortedSet <String> ss=new TreeSet <String>();
	ss.add("Barathi"); 
	ss.add("Barathi");
	ss.add("Surya"); 
	ss.add("Manju");
	ss.add("Mohammad");
	ss.add("Keerthi");
	System.out.println(ss);
	Iterator i=ss.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	}

}
