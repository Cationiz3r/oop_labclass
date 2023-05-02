package hust.soict.dsai.aims.console;

import java.util.Arrays;

public class CartSort
extends Base {
	public CartSort(Base menu) {
		super(menu);
		options = Arrays.asList(
			"Sort by title",
			"Sort by price"
		);
	}

	@Override
	protected void displayInfo() {
		cart.print();
		System.out.println();
	}

	@Override
	protected void handleChoice(int choice) {
	}
}
