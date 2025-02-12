package week4.day1.Home;

import java.util.Arrays;

public class SecondLargeNo {

	public static void main(String[] args) {
		int a[]= {3, 2, 11, 4, 6, 7};
		Arrays.sort(a);
		// printing second largest number 
		System.out.println("The second largest number is : "+ a[4]);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		
		
	}

}
