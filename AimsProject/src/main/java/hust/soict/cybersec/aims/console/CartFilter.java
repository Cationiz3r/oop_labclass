package hust.soict.cybersec.aims.console;

import java.util.Arrays;
import java.util.InputMismatchException;
import hust.soict.cybersec.aims.media.Media;

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
	}

	@Override
	protected void handleChoice(int choice) {
		Media item = null;

		switch(choice) {
		case 1:
			System.out.print("Enter item's ID: ");
			int id = -1;
			try {
				id = scanner.nextInt();
			} catch (InputMismatchException e) {}
			scanner.nextLine(); // Consume newline char
			item = cart.searchById(id);
			break;
		case 2:
			System.out.print("Enter title of item: ");
			var search = scanner.nextLine();
			item = cart.searchByTitle(search.trim());
			break;
		}
		if (item != null) System.out.println(item.toString());
		else System.out.println("No item with that criteria");

		scanner.nextLine();
	}
}
