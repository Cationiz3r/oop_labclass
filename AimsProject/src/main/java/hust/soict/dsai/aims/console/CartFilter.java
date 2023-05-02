package hust.soict.dsai.aims.console;

import java.util.Arrays;

public class CartFilter
extends Base {
	public CartFilter(Base menu) {
		super(menu);
		options = Arrays.asList(
			"Filter by ID",
			"Filter by title"
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
