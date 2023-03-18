package collections;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> basket = new HashMap<String, Integer>();

		basket.put("Soap", 1);
		basket.put("Toothpaste", 5);
		basket.put("WashingPowder", 2);
		basket.put("Deodrant", 2);
		// basket.put(null, null);
		System.out.println("The map is :" + basket);

		basket.put("WashingPowder", 4); // Quantity will be updated as key (item) is unique in the list.
		System.out.println("The updated map is :" + basket);

		basket.remove("Toothpaste");// deletes Toothpaste
		System.out.println("The updated map after deleting is :" + basket);

		for (String item : basket.keySet()) {

			System.out.println("The item name is : " + item);
			System.out.println("The item quantity is :" + basket.get(item));
		}

		for (Integer val : basket.values()) {

			System.out.println("The value is: " + val);
		}

		String str = "Clean World Green World Happy World";
		String[] arr1 = str.split(" ");
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		for (String word : arr1) {
			if (!map1.keySet().contains(word)) {
				map1.put(word, 1);
			} else {
				map1.put(word, map1.get(word) + 1);
			}

		}
		System.out.println("The resulting map  is " + map1);

	}

}
