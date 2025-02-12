package week4.day1.Home;

import java.util.ArrayList;
import java.util.List;

public class Inserction {

	public static void main(String[] args) {
	int a[]= {3, 2, 11, 4, 6, 7};
	int b[]= {1, 2, 8, 4, 9, 7};
	List<Integer> l1=new ArrayList<>();
	l1.add(a[0]);
	l1.add(a[1]);
	l1.add(a[2]);
	l1.add(a[3]);
	l1.add(a[4]);
	l1.add(a[5]);
	List<Integer> l2=new ArrayList<>();
	l2.add(b[0]);
	l2.add(b[1]);
	l2.add(b[2]);
	l2.add(b[3]);
	l2.add(b[4]);
	l2.add(b[5]);
	for (Integer integer : l1) {
		for (Integer integer2 : l2) {
			if(integer.equals(integer2)) {
				System.out.print(integer +" ");
			}
		}
		}
	
	}

}
