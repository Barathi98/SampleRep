package collections;
//unique elements with sorting by the ascending order or by user defined through constructor
//under sorted set interface->set
import java.util.Iterator;
import java.util.TreeSet;

public class MyTreeset {

	public static void main(String[] args) {
		TreeSet<String> T= new TreeSet <String>();
		T.add("Barathi");
		T.add("Barathi");
		T.add("Surya");
		T.add("Manju");
		T.add("Mohammad");
		T.add("Shanavas");
		T.add("Karuna");
		System.out.println(T);
		@SuppressWarnings("rawtypes")
		Iterator i=T.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next().toString());
		}
	}
	}


