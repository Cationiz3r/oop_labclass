package hust.soict.cybersec.aims.test.cart;

import hust.soict.cybersec.aims.cart.Cart;
import hust.soict.cybersec.aims.disc.DigitalVideoDisc;

public class CartTest {
	public static void main(String[] args) {
		// Create a cart
		var cart = new Cart();

		// Create some DVDs
		var dvd1 = new DigitalVideoDisc(
			"The Lion King",
			"Animation",
			"Roger Allers",
			87,
			19.95f
		);
		var dvd2 = new DigitalVideoDisc(
			"Star Wars",
			"Science Fiction",
			"George Lucas",
			87,
			24.95f
		);
		var dvd3 = new DigitalVideoDisc(
			"Aladin",
			"Animation",
			18.99f
		);

		// Add DVDs to cart
		cart.addDigitalVideoDisc(dvd1);
		cart.addDigitalVideoDisc(dvd2);
		cart.addDigitalVideoDisc(dvd3);

		// Test print method
		cart.print();

		// Test search methods
		cart.searchById(1);
		cart.searchByTitle("Aladin");
		cart.searchById(99);
		cart.searchByTitle("The Matrix");
	}
}
