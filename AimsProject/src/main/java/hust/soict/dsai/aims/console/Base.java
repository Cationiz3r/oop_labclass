package hust.soict.dsai.aims.console;

import java.util.List;
import java.util.Scanner;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.store.Store;

public abstract class Base {
	private boolean inLoop = true;
	protected Store store;
	protected Cart cart;
	protected Scanner scanner;
	protected List<String> options;

	Base(Store store, Cart cart, Scanner scanner) {
		this.store = store;
		this.cart = cart;
		this.scanner = scanner;
	}

	protected abstract void displayInfo();
	protected abstract void handleChoice(int choice);

	private void handleRawInput(String input) {
		try {
			int choice = Integer.parseInt(input);
			if (choice == 0) {
				inLoop = false;
				return;
			}
			handleChoice(choice);
		} catch (NumberFormatException e) {
			System.out.print("\nInvalid choice!");
			scanner.next();
		}
	}

	public void display() {
		while (inLoop) {
			System.out.print("\033[H\033[2J"); // Clear screen
			System.out.flush();

			displayInfo();
			System.out.println("Options:\n---------------------------------");
			for (int i = 0; i < options.size(); ++i)
				System.out.println(i + 1 + ". " + options.get(i));
			System.out.println("0. Back");
			System.out.println("---------------------------------");
			System.out.print("Please choose a number: ");

			handleRawInput(scanner.next());
		}
	}
}
