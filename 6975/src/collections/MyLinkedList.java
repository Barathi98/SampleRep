package collections;
//same as arraylist execution time is better than arraylist on manipulation 
//implements list


import java.util.LinkedList;

public class MyLinkedList {

	public static void main(String[] args) {
		LinkedList <String> a=new LinkedList<String>();
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
