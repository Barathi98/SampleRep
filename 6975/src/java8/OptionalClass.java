package java8;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		String []str=new String[10];
		str[5]="optional class";
		Optional empty=Optional.empty(); //return the optional class's object,it doesn't return any value
        System.out.println(empty);
        Optional<String> value=Optional.of(str[5]);//if value presents-optional else return empty and throw exception
        System.out.println(value);
        System.out.println("Filtered Value: "+value.filter((s)->s.equals("equal")));
        System.out.println("filtered value: "+value.filter((s)->s.equals("optional class...")));
        System.out.println("getting value:"+value.get()); //returns a value else throws noSuchelementfoundException
        System.out.println("hash code:"+value.hashCode()); //returns hashcode
        System.out.println("IsValue:"+value.isPresent());//boolean
        System.out.println("ofnullable "+Optional.ofNullable(str[5]));
        System.out.println("orElse:"+value.orElse("Value is not present"));
        System.out.println("orElse:"+empty.orElse("value is not present"));
        value.ifPresent(System.out::println);
	}

}
