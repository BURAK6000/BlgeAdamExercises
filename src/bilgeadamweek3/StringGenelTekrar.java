package bilgeadamweek3;

public class StringGenelTekrar {

	public static void main(String[] args) {

		System.out.println(1 + 3 + "kemal");
		System.out.println("kemal" + 1 + 3);

		System.out.println("abc".strip().length()); // abc

		String input = "I am Venkatesh";

		String outputString = input.indent(6);
		System.out.println(outputString);

		var block = """
				a




				  b
				c""";
		System.out.println(block);
		System.out.println(block.length());

		System.out.println("   i ".isBlank()); // true
		System.out.println("".isBlank()); // true

		var name = "Kate";
		var orderId = 5;
		// All print: Hello Kate, order 5 is ready
		System.out.println("Hello " + name + ", order " + orderId + " is ready");

		System.out.println(String.format("Hello %s, order %d is ready", name, orderId));

		System.out.println("Hello %s, order %d is ready".formatted(name, orderId));

		var pi = 3.14159265359;
		System.out.format("[%f]", pi); // [3.141593]
		System.out.println();
		System.out.println();
		System.out.format("[%12.8f]", pi); // [ 3.14159265]
		System.out.println();
		System.out.println();
		System.out.format("[%012f]", pi); // [00003.141593]
		System.out.println();
		System.out.println();
		System.out.format("[%12.2f]", pi); // [ 3.14]
		System.out.println();
		System.out.println();
		System.out.format("[%.3f]", pi); // [3.142]

	}

}
