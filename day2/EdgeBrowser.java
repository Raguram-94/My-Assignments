package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		Browser obc = new Browser();
		String ab=obc.launchBrowser("Browser launched successfully in EdgeBrowser");
		System.out.println(ab);
		obc.loadUrl();
	}

}
