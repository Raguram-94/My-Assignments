package week3.day1;

public class Palindrom {

	public static void main(String[] args) {
		String pal="MAM";
		String rev="";
		//char[] charArray = pal.toCharArray();
		for(int i=pal.length()-1;i>=0;i--) {
		 rev+= pal.charAt(i);}
			if(pal.equalsIgnoreCase(rev)){
				System.out.println("The given String is palendrom");
			}
			else {
				System.out.println("The given String is not a palendrom");
			}	
			}
			
		}
	


