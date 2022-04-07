package java8;
//consumer-accepts only single argument and doesn't return any value 
//supplier-doesn't take any input and supply only the object
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> c=s->System.out.println(s.toUpperCase());
		Consumer<String> c1=s->System.out.println(s.toLowerCase());
        c.accept("hello world");
        c1.accept("JAVA PROGRAMMING");
        Supplier<Double> sup=()->Math.random();
        System.out.println(sup.get());
	}

}
