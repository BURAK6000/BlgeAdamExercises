package bilgeadamweek5.collections.stack;

import java.util.Stack;

public class ParaSayma {

	public static void main(String[] args) {
//		System.out.println("================Stack Doldurma=======================");
//		Stack<Integer> stack = new Stack<Integer>();
//		stack.push(1);
//		stack.push(2);
//		stack.push(3);
//		stack.push(3);
//		stack.push(3);
//		stack.push(3);
//		stack.push(377);
//		stack.push(30);
//		stack.push(366);
//		stack.push(366);
//		stack.push(33);
//		stack.push(3666666);
//
//		stack.forEach(s -> System.out.println(s));
//
//		int n = stack.size();
//
//		System.out.println("===================Stack Bosaltma====================");

//		for (int i = 0; i < n; i++) {
//
//			System.out.println(stack.pop());
//		}

		ParaSayma paraSayma = new ParaSayma();

		paraSayma.stackYuzdenBuyukElemanlar();

	}

	public void stackYuzdenBuyukElemanlar() {

		Stack<Integer> stack = new Stack<Integer>();

		Stack<Integer> stackYuzdenBuyuk = new Stack<Integer>();

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(377);
		stack.push(30);
		stack.push(366);
		stack.push(366);
		stack.push(33);
		stack.push(3666666);
		int toplam = 0;

		while (stack.isEmpty() == false) {
			if (stack.peek() >= 100) {
				stackYuzdenBuyuk.add(stack.pop());
			} else {
				toplam += stack.pop();

			}
		}
		System.out.println("======= Yeni Stack ==========");
		stackYuzdenBuyuk.forEach(s -> System.out.println(s));
		System.out.println("100 den kucuk elemanlar toplami: " + toplam);
	}

}
