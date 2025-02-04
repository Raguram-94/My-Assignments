package week3.day2PolymorbismHomeAssignment;

public class RidingExecution {

	public static void main(String[] args) {
		LoginPage lPage = new LoginPage();
		lPage.clickElement();
		lPage.enterText();
		lPage.findElement();
		// Achieving method overriding
		lPage.performCommonTasks();

	}

}
