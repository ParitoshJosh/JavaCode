package test;

public class ForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("End of for loop");

		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println("End of second for loop");

		for (int i = 2; i <= 10; i = i + 2) {
			System.out.println(i);
		}
		System.out.println("End of for loop");

		for (int i = 10; i >= 2; i = i - 2) {
			System.out.println(i);
		}
		System.out.println("End of for loop");

		System.out.println("Table of 2");

		int num = 2;
		for (int i = 1; i < 11; i++) {
			// System.out.println(num * i);
			System.out.printf("%d * %d = %d \n", num, i, num * i);
		}
		System.out.println("End Table of 2");

		int[] arr1 = { 1, 3, 6, 2, 8, 9 };
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("******The End******");
		// for each loop
		for (int val : arr1) {
			System.out.println("Value is :" + val);
		}
		System.out.println("******The End******");

		String str = "Paritosh is from India";
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		System.out.println("******The End******");

	}
}
