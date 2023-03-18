package test;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Nitin";
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i);
		}
		System.out.println("Reversed string is : " + result);
		if (str.equalsIgnoreCase(result)) {
			System.out.println("It is a palindrome");
		} else
			System.out.println("It is not a palindrome");
		
		System.out.println("******The End******");
		
		// Reverse a string meaningfully
		String str1 = "David meets John and Lily";
		String[] arr =str1.split(" "); // arr = {"David","meets","John","and","Lily"}
		String result1= "";
		for(int i=arr.length-1 ; i>=0;i--){
			result1 = result1 + arr[i] + " ";
		}
		 System.out.println("The result is : " + result1.trim());
	}

}
