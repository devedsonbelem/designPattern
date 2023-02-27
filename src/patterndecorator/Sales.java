package patterndecorator;

import java.util.ArrayList;
import java.util.List;

public class Sales extends Decorator {
	protected final List<String> productSales = new ArrayList<String>();

	public Sales(LibraryItem libraryItem) {
		super(libraryItem);
	}

	public void adicionaItem(String name) {
		productSales.add(name);
		super.libraryItem.setNumberCopies(super.libraryItem.getNumberCopies() - 1);
	}

	public void devolveItem(String name) {
		productSales.remove(name);
		libraryItem.setNumberCopies(super.libraryItem.getNumberCopies() + 1);
	}

	public void display() {
		super.display();
		for (String sales : productSales) {
			System.out.println(" vendidos: " + sales);
		}
	}
}
