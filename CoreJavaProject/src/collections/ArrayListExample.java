package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("John");
		list1.add("Smith");
		list1.add("Leena");
		list1.add("Priya");

		System.out.println("The List Is " + list1);
		System.out.println("The Size of the list is " + list1.size());
		System.out.println("First name in the list is " + list1.get(0));
		System.out.println("Last name in the list is " + list1.get(list1.size() - 1));

		list1.set(1, "Mike"); // replaces the 2nd element in the list
		System.out.println("The list after replacing Smith " + list1);

		list1.remove(2); // removes the 3rd element in the list
		System.out.println("The list after deleting Leena " + list1);

		list1.add(1, "Paritosh"); // adds element in the 2nd position
		System.out.println("The list after adding Paritosh " + list1);

		// Iterating through the list --- using 3 different methods
		System.out.println("*****Method 1******");
		for (int i = 0; i <= list1.size() - 1; i++) {
			System.out.println("The element in the list " + list1.get(i));
		}

		System.out.println("*****Method 2******");
		for (String value : list1) {
			System.out.println("The element in the list is " + value);
		}

		System.out.println("*****Method 3******");
		Iterator<String> itr = list1.iterator();
		while (itr.hasNext()) {
			System.out.println("The element in the list is " + itr.next());
		}

		// Sorting
		System.out.println("****Sorting****");
		Collections.sort(list1);
		System.out.println("After sorting" + list1);

		Collections.sort(list1, Collections.reverseOrder());
		System.out.println("After sorting in descending order " + list1);

		// Practice
		System.out.println("**********************");
		System.out.println("******Practice********");
		ArrayList<Integer> Numb = new ArrayList<Integer>();
		Numb.add(90);
		Numb.add(20);
		Numb.add(550);
		Numb.add(35);
		System.out.println("The list is " + Numb);
		System.out.println("Minimum number in the list is " + Collections.min(Numb));

		for (Integer MyNumber : Numb) {
			System.out.println("The numbers in the list is " + MyNumber);
		}
		Collections.sort(Numb);
		System.out.println("After Sorting " + Numb);

		Collections.reverse(Numb);
		System.out.println("Reverse Order " + Numb);

	}

}
