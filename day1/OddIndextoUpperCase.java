package week3.day1;

public class OddIndextoUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] cs = test.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			if (i % 2 != 0) {
				String c = "" + cs[i];
				System.out.print(c.toUpperCase()); // it will print Uppercase character
			} else {
				System.out.print(cs[i]); // it will print same character
			}
		}

	}

}
