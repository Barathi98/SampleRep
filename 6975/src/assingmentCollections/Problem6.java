package assingmentCollections;
//Implement the assignment 1 using Linked List
import java.util.LinkedList;

public class Problem6 {
	LinkedList<Integer> list=new LinkedList <Integer>();
@SuppressWarnings("rawtypes")
LinkedList<Integer> SaveEvenNumber(int num)
{
	list=new LinkedList<Integer>();
	for(int i=2;i<=num;i++)
	{
		if(i%2==0)
		
		list.add(i);
		System.out.println(list);
		}
	return list;
}
LinkedList <Integer> PrintEvenNum()
{
	LinkedList<Integer> list2= new LinkedList<Integer>();
	for(int i:list) //will search for the even numbers list
	{
		list2.add(i*2);
		System.out.println(i*2);
	}
	return list2;
}

	public static void main(String[] args) {
		Problem6 p=new Problem6();
		p.SaveEvenNumber(20);
		p.PrintEvenNum();
		
	}

}
