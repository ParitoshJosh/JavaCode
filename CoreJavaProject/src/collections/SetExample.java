package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Jack");
		set1.add("Lilly");
		set1.add("Naina");
		set1.add("Paritosh");
		set1.add("Naina");// duplicate elements not allowed---> check the output
		
		System.out.println("The HashSet is " + set1);
		
		TreeSet<String> set2 = new TreeSet<String>();
		set2.add("Jack");
		set2.add("Lilly");
		set2.add("Naina");
		set2.add("Ash");
		set2.add("Naina");
		
		System.out.println("The TreeSet is " + set2); // prints the sorted list automatically
		
		//Convert set to list
		ArrayList<String> list1= new ArrayList<String>(set1);
		System.out.println("Converted Hashset to list" + list1);
		
		ArrayList<String> list2= new ArrayList<String>(set2);
		System.out.println("Converted Treeset to list"+list2);
	}

}
