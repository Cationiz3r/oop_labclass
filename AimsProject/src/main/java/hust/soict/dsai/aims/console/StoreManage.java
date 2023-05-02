package hust.soict.dsai.aims.console;

import java.util.Arrays;

public class StoreManage
extends Base {
	public StoreManage(Base menu) {
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
