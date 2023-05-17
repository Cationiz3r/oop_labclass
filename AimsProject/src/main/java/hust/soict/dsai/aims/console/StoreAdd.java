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

	}
}
