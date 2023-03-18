package test;
import java.util.Scanner;
public class ConditionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner scannObj = new Scanner(System.in);
		System.out.println("Enter Age");
		age=scannObj.nextInt();
		if (age < 17) {
			System.out.println("Not eligible to vote");
		} else if (age == 17) {
			System.out.println("You will be allowed to vote next year");
		}else {
			System.out.println("You are allowed to vote");
		}
			scannObj.close();
	}

}
