package ca.poltech.mybank.misc;

public class MyExceptions {

	public static void main(String[] args) {
		methodOne(20);
	}

	public static void methodOne(double value) {
		System.out.println("I am method one and my value is: " + value);
		methodTwo(value);
		System.out.println("End of method one");
	}

	private static void methodTwo(double value) {
		System.out.println("I am method two and my value is: " + value);
		methodThree(value - 1);
		System.out.println("End of method two");

	}

	private static void methodThree(double value) {
		System.out.println("I am method Three and my value is: " + value);

		
		value = 3 / value;
		methodFour(value);
		System.out.println("End of method Three");

	}

	private static void methodFour(double value) {
		System.out.println("I am method Four and my value is: " + value);
		System.out.println("End of method Four");

	}
}