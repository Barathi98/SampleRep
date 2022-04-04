package collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class MyQueue {

	public static void main(String[] args) {
		PriorityQueue<String> q=new PriorityQueue<String>();
		q.add("A");
		q.add("B");
		q.add("C");
		q.add("D");
		q.add("E");
		System.out.println("The queue elements are....");
		for(String i:q)
		{
			System.out.println(i);
		}
		System.out.println("____________________________________");
		Iterator i=q.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("The queue top element is "+q.element()); //throws exception if queue is empty
		System.out.println("The queue top element is "+q.peek());//return null value if the queue is empty
        q.offer("F");
        System.out.println(q);
        System.out.println("the size of the queue is "+q.size());
	}

}
