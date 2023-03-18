package test;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =33;
		boolean flag = true;
		for (int i = 2; i <= num/2; i++) {
			int remainder = num % i;
			if (remainder == 0) {
				flag = false;
				break;
			}
		}
		if (flag==true) {
			System.out.println("Number is prime");
		}else
			System.out.println("Number is not prime");
	}

}
