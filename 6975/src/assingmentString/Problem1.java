package assingmentString;

import java.util.ArrayList;
public class Problem1 {
	ArrayList <Integer>list=new ArrayList <Integer>();
@SuppressWarnings("rawtypes")
ArrayList SaveEvenNumber(int num)
{
	list=new ArrayList<Integer>();
	for(int i=2;i<=num;i++)
	{
		if(i%2==0)
		
		list.add(i);
		System.out.println(list);
		}
	return list;
}
ArrayList <Integer> PrintEvenNum()
{
	ArrayList<Integer> list2= new ArrayList<Integer>();
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