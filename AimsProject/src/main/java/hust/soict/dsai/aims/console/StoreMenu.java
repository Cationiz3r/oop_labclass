package hust.soict.dsai.aims.console;

import java.util.Arrays;
import java.util.Scanner;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.store.Store;

public class StoreMenu
extends Base {
	public StoreMenu(Store store, Cart cart, Scanner scanner) {
		super(store, cart, scanner);
		options = Arrays.asList(
			"See a media’s details",
			"Add a media to cart",
			"Play a media",
			"See current cart"
		);
	}

	@Override
	protected void displayInfo() {
		// print store
	}

	@Override
	protected void handleChoice(int choice) {

	}
}
