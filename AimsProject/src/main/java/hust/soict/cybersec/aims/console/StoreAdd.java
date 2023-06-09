package hust.soict.cybersec.aims.console;

import java.util.Arrays;
import java.util.InputMismatchException;
import hust.soict.cybersec.aims.media.Book;
import hust.soict.cybersec.aims.media.CompactDisc;
import hust.soict.cybersec.aims.media.DigitalVideoDisc;
import hust.soict.cybersec.aims.media.Track;

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

	private Track makeTrack() {
		System.out.print("  Enter title: ");
		var title = scanner.nextLine().trim();
		if (title.isEmpty()) return null;

		int length = 0;
		System.out.print("  Enter duration: ");
		try {
			length = scanner.nextInt();
		} catch (InputMismatchException e) {}
		scanner.nextLine();

		return new Track(title, length);
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

		switch(choice) {
		case 1:
			var book = new Book(title, category, cost);

			System.out.println("Enter authors:");
			while (true) {
				System.out.print("  ");
				var author = scanner.nextLine().trim();
				if (author.isEmpty()) break;
				book.addAuthor(author);
			}

			store.addMedia(book);
			break;
		case 2:
			System.out.print("Enter artist: ");
			var artist = scanner.nextLine().trim();
			var disc = new CompactDisc(title, category, director, length, cost, artist);

			System.out.println("Enter tracks:");
			while (true) {
				var track = makeTrack();
				if (track == null) break;
				disc.addTrack(track);
			}

			store.addMedia(disc);
			break;
		case 3:
			store.addMedia(new DigitalVideoDisc(title, category, director, length, cost));
			break;
		}

		System.out.println("\nItem has been added to the store.");
		scanner.nextLine();
	}
}
