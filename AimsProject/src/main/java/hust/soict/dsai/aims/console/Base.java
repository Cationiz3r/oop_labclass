package hust.soict.dsai.aims.console;

import java.util.InputMismatchException;
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

	protected Base(Store store, Cart cart, Scanner scanner) {
		this.store = store;
		this.cart = cart;
		this.scanner = scanner;
	}
	protected Base(Base menu) {
		this.store = menu.store;
		this.cart = menu.cart;
		this.scanner = menu.scanner;
	}

	protected void exit() { inLoop = false; }

	protected abstract void displayInfo();
	protected abstract void handleChoice(int choice);

	private void handleRawInput() {
		try {
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline char
			if (choice == 0) {
				inLoop = false;
				return;
			}
			handleChoice(choice);
		} catch (InputMismatchException e) {
			System.out.print("\nInvalid choice!");
			scanner.nextLine();
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

			handleRawInput();
		}
	}
}
