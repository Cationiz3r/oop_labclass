package hust.soict.cybersec.aims.console;

import java.util.Arrays;
import hust.soict.cybersec.aims.media.Media;

public class Store
extends Base {
	public Store(Base menu) {
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
	}

	@Override
	protected void handleChoice(int choice) {
		Media item = null;
		if (choice <= 3) {
			System.out.print("Enter title of item: ");
			var search = scanner.nextLine();
			item = store.searchByTitle(search.trim());

			if (item == null) {
				System.out.println("No item with that title!");
				scanner.nextLine();
				return;
			}
		}

		switch(choice) {
			case 1:
				new StoreDetail(this, item).display();
				break;
			case 2:
				cart.addMedia(item);
				scanner.nextLine();
				break;
			case 3:
				item.tryPlay();
				scanner.nextLine();
				break;
			case 4:
				new Cart(this).display();
				break;
		}
	}
}
