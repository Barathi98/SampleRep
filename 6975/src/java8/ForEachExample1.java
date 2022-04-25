package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ForEachExample1 {

	public static void main(String[] args) {
		List<String> gamesList=new ArrayList<String>();
        gamesList.add("Football");
        gamesList.add("Cricket");
        gamesList.add("Chess");
        gamesList.add("Hockey");
        gamesList.add(null);
        gamesList.add("Chess");
        gamesList.add("Football");
        gamesList.add("null");
        gamesList.add("Cricket");
        Set<String> set=gamesList.stream().collect(Collectors.toSet());
        set.forEach(game->System.out.println(game));
	}

}
