package java8;
import java.util.function.Function;
public class Functionalinterface {

	public static void main(String[] args) {
		Function<String,Integer> f=s->s.length();
        System.out.println(f.apply("Hello world"));
        int amount=3;
        Function<Integer,Integer>sum=i->i+i;
        Function<Integer,Integer>square=i->i*i;
        System.out.println(sum.apply(amount));
        System.out.println(square.apply(amount));
        System.out.println(sum.andThen(square).apply(amount));
        System.out.println(sum.compose(square).apply(amount));
        System.out.println("---------------------");
        Function <Integer,Integer> identify=Function.identity();
        System.out.println(identify.apply(amount));
        Function <Integer,Integer> identify2=e->e;
        System.out.println(identify2.apply(amount));
        
	}

}
