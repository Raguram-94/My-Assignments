package week3.day2homeassignment;

public class Elements {

	public static void main(String[] args) {
		// For invoking Multi Level Inheritance

		/*
		 * CheckBoxButton chButton = new CheckBoxButton(); chButton.click();
		 * chButton.clickCheckButton(); String setText =
		 * chButton.setText("Webelement Settext method called..; ");
		 * System.out.println(setText); chButton.submit();
		 */

        // For invoking Single Inheritance 

		Button button = new Button();
		button.click();
		String setText = button.setText("WebElement setText method called");
		System.out.println(setText);

	}

}
