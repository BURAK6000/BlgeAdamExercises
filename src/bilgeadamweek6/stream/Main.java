package bilgeadamweek6.stream;

import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		Stream<Integer> s = Stream.iterate(1, n -> n + 1);

		s.skip(12).limit(2).forEach(System.out::print); // 67

		Stream<String> s1 = Stream.of("monkey", "gorilla", "bonobo");
		s1.map(String::length).forEach(System.out::print); // 676

	}

}
