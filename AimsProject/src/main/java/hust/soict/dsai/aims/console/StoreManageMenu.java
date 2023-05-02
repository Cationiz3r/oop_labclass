package hust.soict.dsai.aims.console;

import java.util.Arrays;

public class StoreManageMenu
extends Base {
	public StoreManageMenu(Base menu) {
		super(menu);
		options = Arrays.asList(
			"Add media",
			"Remove media"
		);
	}

	@Override
	protected void displayInfo() {
		store.print();
		System.out.println();
	}

	@Override
	protected void handleChoice(int choice) {

	}
}
