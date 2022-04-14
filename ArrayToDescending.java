package practical_lab;

//How to sort ArrayList in descending order

import java.util.*;

public class ArrayToDescending {
	public static void main(String args[])
	{

		// Get the ArrayList
		ArrayList<String>list = new ArrayList<String>();

		
		list.add("apple");
		list.add("tiger");
		list.add("sun");
		list.add("hat");
		list.add("cat");

		// Print the unsorted ArrayList
		System.out.println("Unsorted ArrayList: "
						+ list);

		// Sorting ArrayList in descending Order
		
		Collections.sort(list, Collections.reverseOrder());

		// Print the sorted ArrayList
		System.out.println("Sorted ArrayList "
						+ "in Descending order : "
						+ list);
	}
}


