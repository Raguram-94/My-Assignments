package week3.day1;

public class ReverseOddWord {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] splwrds=test.split(" ");
		for(int i=0;i<splwrds.length;i++) {
			if(i%2!=0) {
				char[] charArray = splwrds[i].toCharArray();
				for(int j=charArray.length-1;j>=0;j--) {
					char rev=charArray[j];
					System.out.print(rev);
				}
			}
			else {
				System.out.print(splwrds[i]);
			}
			System.out.print(" ");
		}
	}

}
