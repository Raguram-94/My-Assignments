package week3.day1;

public class ReverseString {

	public static void main(String[] args) {
     String companyName="Test Leaf";
     char[] cs = companyName.toCharArray();
    for (int i=cs.length-1;i>=0;i--) {
    	System.out.print(cs[i]);
    }

	}

}
