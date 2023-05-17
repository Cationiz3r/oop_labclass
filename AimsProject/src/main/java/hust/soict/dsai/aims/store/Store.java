package hust.soict.dsai.aims.store;

import java.util.ArrayList;
import hust.soict.dsai.aims.media.Media;

public class Store {
	private ArrayList<Media> items = new ArrayList<Media>();

	public void addMedia(Media media) {
		if (items.contains(media)) {
			System.out.println("The item is already in the store");
			return;
		}
		items.add(media);
		System.out.println("The item has been added");
	}

	public void removeMedia(Media media) {
		if (items.size() == 0) {
			System.out.println("The store is empty");
			return;
		}
		if (!items.contains(media)) {
			System.out.println("The item is not in the store");
			return;
		}
		items.remove(media);
		System.out.println("The item has been removed");
	}

	public void print() {
		System.out.println("Store:\nID | Title - Category - Extra: Cost");
		for (Media item: items)
			System.out.println(item.getId() + " | " + item.toString());
	}

	public Media searchByTitle(String title) {
		for (Media item: items)
			if (item.matchTitle(title)) return item;
		return null;
	}
}
