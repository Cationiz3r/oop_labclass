package hust.soict.dsai.aims.console;

import java.util.Arrays;
import hust.soict.dsai.aims.media.Media;

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
		Media item = null;

		switch(choice) {
		case 1:
			break;
		case 2:
			break;
		}
	}
}
