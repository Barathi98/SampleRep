package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ForEachExample {

	public static void main(String[] args) {
		List<String> trainers=new ArrayList<String>();
trainers.add("Soham");
trainers.add("Tina");
trainers.add("Anju");
trainers.add("Kavya");
trainers.add(null);
trainers.add("null");
trainers.add("Soham");
trainers.add("Tina");
Set<String> set=trainers.stream().filter(s->s.startsWith("S")).collect(Collectors.toSet());
System.out.println(set);
	}

}
