package hust.soict.dsai.aims.console;

import java.util.Arrays;

public class StoreAdd
extends Base {
	public StoreAdd(Base menu) {
		super(menu);
		options = Arrays.asList(
			"Book",
			"Compact disc",
			"DVD"
		);
	}

	@Override
	protected void displayInfo() {
		System.out.println("Add a media:");
	}

	@Override
	protected void handleChoice(int choice) {
		System.out.print("Enter title: ");
		var title = scanner.nextLine().trim();

		if (title.isEmpty()) {
			System.out.println("An item can not have an empty title!");
			scanner.nextLine();
			return;
		}
		if (store.searchByTitle(title) != null) {
			System.out.println("An item with title already exists!");
			scanner.nextLine();
			return;
		}

		System.out.print("Enter category: ");
		var category = scanner.nextLine().trim();

		String director = null;
		int length = 0;
		if (choice > 1) {
			System.out.print("Enter director: ");
			director = scanner.nextLine().trim();

			System.out.print("Enter duration: ");
			try {
				length = scanner.nextInt();
			} catch (InputMismatchException e) {}
			scanner.nextLine();
		}

		float cost = 0;
		System.out.print("Enter cost: ");
		try {
			cost = scanner.nextFloat();
		} catch (InputMismatchException e) {}
		scanner.nextLine();

	}
}
