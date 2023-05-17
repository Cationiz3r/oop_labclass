package hust.soict.cybersec.aims.console;

import java.util.Arrays;
import hust.soict.cybersec.aims.media.Media;

public class StoreManage
extends Base {
	public StoreManage(Base menu) {
		super(menu);
		options = Arrays.asList(
			"Add media",
			"Remove media"
		);
	}

	@Override
	protected void displayInfo() {
		store.print();
	}

	@Override
	protected void handleChoice(int choice) {
		switch (choice) {
		case 1:
			new StoreAdd(this).display();
			break;
		case 2:
			Media item = null;
			System.out.print("Enter item title: ");
			var search = scanner.nextLine();
			item = store.searchByTitle(search.trim());

			if (item == null) System.out.println("No item with that title!");
			else System.out.println("Item has been removed!");

			store.removeMedia(item);
		}
	}
}
