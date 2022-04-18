package StringJoiner;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerEx {
	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner(":", "[", "]");
		 sj.add("Jeice").add("Priscillas").add("Isaías");
		 sj.toString();
		 
		 List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
		 numbers.stream()
		     .map(i -> i.toString())
		     .collect(Collectors.joining(", "));
	}
}
