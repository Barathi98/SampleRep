package assingmentCollections;
//Implement the assignment 1 using Vector

import java.util.Vector;

public class Problem7 {
	Vector <Integer>list=new Vector<Integer>();
	@SuppressWarnings("rawtypes")
	Vector SaveEvenNumber(int num)
	{
		list=new Vector<Integer>();
		for(int i=2;i<=num;i++)
		{
			if(i%2==0)
			
			list.add(i);
			System.out.println(list);
			}
		return list;
	}
	Vector <Integer> PrintEvenNum()
	{
		Vector<Integer> list2= new Vector<Integer>();
		for(int i:list) //will search for the even numbers list
		{
			list2.add(i*2);
			System.out.println(i*2);
		}
		return list2;
	}

		public static void main(String[] args) {
			Problem1 p=new Problem1();
			p.SaveEvenNumber(20);
			p.PrintEvenNum();
			
		}

}
