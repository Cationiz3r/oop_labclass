package hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import java.util.Collections;
import hust.soict.dsai.aims.media.Media;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

	public void addMedia(Media media) {
		if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
			return;
		}
		if (itemsOrdered.contains(media)) {
			System.out.println("The item is already in the cart");
			return;
		}
		itemsOrdered.add(media);
		System.out.println("The disc has been added");
	}

	public void removeMedia(Media media) {
		if (itemsOrdered.size() == 0) {
			System.out.println("The cart is empty");
			return;
		}
		if (!itemsOrdered.contains(media)) {
			System.out.println("The item is not in the cart");
			return;
		}
		itemsOrdered.remove(media);
		System.out.println("The disc has been removed");
	}

	public float totalCost() {
		float sum = 0;
		for (Media item: itemsOrdered)
			sum += item.getCost();
		return sum;
	}

	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered items:");
		for (int i = 0; i < itemsOrdered.size(); ++i)
			System.out.println(i + 1 + ". " + itemsOrdered.get(i).toString());
		System.out.println("Total cost: " + totalCost());
		System.out.println("**************************************************");
	}

	public void sortItemsByTitle() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
	}
	public void sortItemsByCost() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
	}

	public void searchById(int id) {
		for (Media item: itemsOrdered)
			if (item.matchId(id)) {
				System.out.println(item.toString());
				return;
			}
		System.out.println("No DVD with that id");
	}
	public void searchByTitle(String title) {
		boolean found = false;
		for (Media item: itemsOrdered)
			if (item.matchTitle(title)) {
				found = true;
				System.out.println(item.toString());
			}
		if (!found) System.out.println("No DVD with that title");
	}
}
