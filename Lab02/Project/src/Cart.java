public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] =
		new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered;

	public Cart() {
		this.qtyOrdered = 0;
	}

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (disc == null) return;
		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
			return;
		}
		itemsOrdered[qtyOrdered] = disc;
		qtyOrdered++;
		System.out.println("The disc has been added");
	}

	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (disc == null) return;
		if (qtyOrdered == 0) {
			System.out.println("The cart is empty");
			return;
		}

		var found = false;
		for (int i = 0; i < MAX_NUMBERS_ORDERED; ++i) {
			if (!found && itemsOrdered[i] == disc) found = true;
			if (found && i < MAX_NUMBERS_ORDERED - 1) {
				itemsOrdered[i] = itemsOrdered[i + 1];
			} else if (found) {
				itemsOrdered[i] = null;
			}
		}

		if (!found) System.out.println("The disc was not in the cart");
		else {
			System.out.println("The disc has been removed");
			qtyOrdered--;
		}
	}

	public float totalCost() {
		float sum = 0;
		for (int i = 0; i < qtyOrdered; ++i) {
			sum += itemsOrdered[i].getCost();
		}
		return sum;
	}
}
