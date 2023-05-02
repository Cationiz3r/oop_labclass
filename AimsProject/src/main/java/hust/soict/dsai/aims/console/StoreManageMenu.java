package hust.soict.dsai.aims.console;

import java.util.Arrays;
import java.util.Scanner;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.store.Store;

public class StoreManageMenu
extends Base {
	public StoreManageMenu(Store store, Cart cart, Scanner scanner) {
		super(store, cart, scanner);
		options = Arrays.asList(
			"Add media",
			"Remove media"
		);
	}

	@Override
	protected void displayInfo() {

	}

	@Override
	protected void handleChoice(int choice) {

	}
}
