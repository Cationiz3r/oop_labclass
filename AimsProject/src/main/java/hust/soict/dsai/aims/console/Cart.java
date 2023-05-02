package hust.soict.dsai.aims.console;

import java.util.Arrays;

public class Cart
extends Base {
	public Cart(Base menu) {
		super(menu);
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
