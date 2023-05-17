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
	}
}