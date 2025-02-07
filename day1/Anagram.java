package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "Listen";
		String text2 = "silenT";
		if (text1.length() != text2.length()) {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");

		} else {
			char[] t1 = text1.toLowerCase().toCharArray();
			char[] t2 = text2.toLowerCase().toCharArray();
			// After sort t1 value
			Arrays.sort(t1);
			System.out.println(t1);
			// After sort t2 value
			Arrays.sort(t2);
			System.out.println(t2);
			// Checking whether the give Strings are anagram or not
			boolean result = Arrays.equals(t1, t2);
			System.out.println("The strings are Anagram or not : " + result);

		}

	}

}
