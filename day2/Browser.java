package week1.day2;

public class Browser {

	public String launchBrowser(String browserName) {
		return browserName;

	}

	public void loadUrl() {
		System.out.println("Application url loaded successfully");

	}

	public static void main(String[] args) {
		Browser ob = new Browser();
		String st = ob.launchBrowser("Browser launched successfully");
		System.out.println(st);
		ob.loadUrl();
	}
}
