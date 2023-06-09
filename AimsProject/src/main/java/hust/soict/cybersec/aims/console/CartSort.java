package hust.soict.cybersec.aims.console;

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
	}

	@Override
	protected void handleChoice(int choice) {
		switch(choice) {
		case 1:
			cart.sortItemsByTitle();
			break;
		case 2:
			cart.sortItemsByCost();
			break;
		}

		exit();
	}
}
