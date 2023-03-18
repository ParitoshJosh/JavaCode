package test;

public class NumbersExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10, num2 = 20, sum;
		sum = addition(num1, num2);
		int difference = subtraction(num1, num2);
		System.out.println("Sum =" + " " + sum);
		System.out.println("Difference =" + " " + difference);

	}

	public static int addition(int a, int b) {

		return a + b;
	}

	public static int subtraction(int a, int b) {

		return a - b;

	}

}
