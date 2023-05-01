package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
	public static final int MAX_ITEMS = 100;
	private DigitalVideoDisc itemsInStore[] =
		new DigitalVideoDisc[MAX_ITEMS];
	private int itemsCount = 0;

	public void addDVD(DigitalVideoDisc disc) {
		if (disc == null) return;
		if (itemsCount == MAX_ITEMS) {
			System.out.println("The store is full");
			return;
		}
		itemsInStore[itemsCount] = disc;
		itemsCount++;
		System.out.println("The disc has been added");
	}

	public void removeDVD(DigitalVideoDisc disc) {
		if (disc == null) return;
		if (itemsCount == 0) {
			System.out.println("The store is empty");
			return;
		}

		var found = false;
		for (int i = 0; i < MAX_ITEMS; ++i) {
			if (!found && itemsInStore[i] == disc) found = true;
			if (found && i < MAX_ITEMS - 1) {
				itemsInStore[i] = itemsInStore[i + 1];
			} else if (found) {
				itemsInStore[i] = null;
			}
		}

		if (!found) System.out.println("The disc was not in the store");
		else {
			System.out.println("The disc has been removed");
			itemsCount--;
		}
	}
}
