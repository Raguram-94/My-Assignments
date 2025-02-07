package week3.day1;

import java.util.Arrays;

public class PrintDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 2, 5, 7, 7, 5, 9, 2, 3 };
		// finding value with index
		System.out.println("Index values is  : " + num[5]);
		Arrays.sort(num);
		/*
		 * for (int i=0;i<num.length-1;i++) {
		 * System.out.print("Printing Acending order : " + num[i]); }
		 */

		for (int i = 0; i < num.length - 1; i++) // for loop for iterating
		{
			if (num[i] == num[i + 1]) // comparing
			{
				System.out.println(num[i]);
			}
		}
		int[] num1 = { 2, 5, 7, 7, 5, 9, 2, 3, };
		Arrays.sort(num1);
		for (int i = 0; i < num1.length; i++) {
			for (int j = i + 1; j < num1.length; j++) {
				if (num1[i] == num[j]) {
					System.out.println("Duplicate values are : " + num[j]);
				}

			}

		}

	}

}
