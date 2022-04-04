package collections;

import java.util.Vector;

//It is a legacy class
//It is synchronized and thread safe
//double the size when it's load factor is 0.75. Default size is 16
public class MyVectorList {

	public static void main(String[] args) {
		Vector <String> v= new Vector <String>();
		v.add("A");
		v.add("B");
		v.add("c");
		v.add("D");
		v.add("E");
		System.out.println("Size of the list before adding an element is "+v.size());
		v.add(4, "Vector");
		System.out.println(v);
		System.out.println("The size of the vector list after adding an element is "+v.size());
	}

}
