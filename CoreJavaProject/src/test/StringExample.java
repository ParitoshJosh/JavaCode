package test;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName = "Paritosh";
		String lastName = "Joshi";

		System.out.println("Number of characters in first name is " + firstName.length());
		System.out.println("Character at 4th position is " + firstName.charAt(3));
		System.out.println("Character at last position is " + firstName.charAt(firstName.length()-1));
		System.out.println("Converted to upper case " + firstName.toUpperCase());
		System.out.println("Converted to lower case " + firstName.toLowerCase());

	}

}
