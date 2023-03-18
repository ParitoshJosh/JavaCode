package test;

public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Print 1 to 10 using While Loop
		int num = 1;
		while (num < 11) {
			System.out.println(num);
			num++;
		}
		System.out.println("End of while loop");

		// Print 10 to 1 using while loop
		int num1 = 10;
		while (num1 > 0) {
			System.out.println(num1);
			num1--;
		}
		System.out.println("End of second while loop");

		// Print 10 to 1 while skipping 5 using while loop
		int num2 = 10;
		while (num2 > 0) {
			if (num2 == 5) {
				System.out.println("skip");
				num2--;
				continue;
			}
			System.out.println(num2);
			num2--;
		}
		System.out.println("End of third while loop");

        // Break after 5
		int num3 = 10;
		while (num3 > 0) {
			if (num3 == 5) {
				//System.out.println("break");
				num2--;
				break;
			}
			System.out.println(num3);
			num3--;
		}
		System.out.println("End of fourth while loop");

	}
}
