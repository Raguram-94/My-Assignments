package week4.day1.Home;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		// Define the list of numbers
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(10);
		numbers.add(6);
		numbers.add(8);

		// Sort the list in ascending order
		Collections.sort(numbers);

		// Loop through the list and check for gaps
		for (int i = 0; i < numbers.size() - 1; i++) {
			// Get the current and next elements using get()
			int currentElement = numbers.get(i);
			int nextElement = numbers.get(i + 1);

			// Check if there's a gap between the current element and the next
			if (currentElement + 1 != nextElement) {
				// Print the missing number (currentElement + 1)
				System.out.println("Missing element: " + (currentElement + 1));
			}
		}

		// Optionally, check if the last element has a gap in the sequence (if needed)
		// For example, if you are expecting the next number to be after the last
		// element in the list
//	        int lastElement = numbers.get(numbers.size() - 1);
//	        System.out.println("Missing element: " + (lastElement + 1));
	}
}
