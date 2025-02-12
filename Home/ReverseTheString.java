package week4.day1.Home;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseTheString {

	public static void main(String[] args) {
		// {HCL, Wipro, Aspire Systems, CTS}
		List<String> list = new ArrayList<>();
		list.add("HCL");
		list.add("Wipro");
		list.add("Aspire Systems");
		list.add("CTS");
		Collections.sort(list);

		for (int i = list.size() - 1; i >= 0; i--) {
			String string = list.get(i);
			System.out.println(string);
		}
	}

}
