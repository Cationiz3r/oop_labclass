package hust.soict.dsai.aims.console;

import java.util.Arrays;
import java.util.Scanner;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.store.Store;

public class CartMenu
extends Base {
	public CartMenu(Store store, Cart cart, Scanner scanner) {
		super(store, cart, scanner);
		options = Arrays.asList(
			"Filter medias in cart",
			"Sort medias in cart",
			"Remove media from cart",
			"Play a media",
			"Place order"
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
