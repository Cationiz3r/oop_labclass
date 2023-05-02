package hust.soict.dsai.aims.console;

import java.util.Arrays;
import java.util.Scanner;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.store.Store;

public class MainMenu
extends Base {
	public MainMenu(Store store, Cart cart, Scanner scanner) {
		super(store, cart, scanner);
		options = Arrays.asList(
			"View store",
			"Update store",
			"See current cart"
		);
	}

	@Override
	protected void displayInfo() {
		System.out.println("AIMS\n");
	}

	@Override
	protected void handleChoice(int choice) {
		switch(choice) {
		case 1:
			var sMenu = new StoreMenu(store, cart, scanner);
			sMenu.display();
			break;
		case 2:
			var sMMenu = new StoreManageMenu(store, cart, scanner);
			sMMenu.display();
			break;
		case 3:
			var cMenu = new CartMenu(store, cart, scanner);
			cMenu.display();
			break;
		}
	}
}
