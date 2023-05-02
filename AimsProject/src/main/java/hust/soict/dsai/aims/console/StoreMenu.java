package hust.soict.dsai.aims.console;

import java.util.Arrays;

public class StoreMenu
extends Base {
	public StoreMenu(Base menu) {
		super(menu);
		options = Arrays.asList(
			"See a media’s details",
			"Add a media to cart",
			"Play a media",
			"See current cart"
		);
	}

	@Override
	protected void displayInfo() {
		store.print();
		System.out.println();
	}

	@Override
	protected void handleChoice(int choice) {

	}
}
