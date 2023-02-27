package patternbridge;

public class Customers extends CustomersBase {

	public void showAll() {
		// Add separator lines
		System.out.println("");
		System.out.println("------------------------");
		super.showAll();
		System.out.println("------------------------");
	}
}
