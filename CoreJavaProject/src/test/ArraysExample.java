package test;

public class ArraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 10, 20, 30, 40, 50, 60 };
		System.out.println("Length of the array is : " + arr1.length);
		System.out.println("First value inside the array is : " + arr1[0]);
		System.out.println("The last element inside the array is : " + arr1[arr1.length - 1]);
		
		String[] arr2 = { "Mon", "Tues", "Wed", "Thurs", "Fri", "Sat", "Sun" };
		System.out.println("Value at 3rd position is : " + arr2[2]);
		
		String str="Clean World Green World Happy World";
		String[] arr3=str.split(" ");
		System.out.println("Total number of words inside the string is : " + arr3.length);
				
	}

}
