package hust.soict.dsai.aims.console;

import java.util.Arrays;
import hust.soict.dsai.aims.media.Media;

public class StoreDetail
extends Base {
	private Media item;

	public StoreDetail(Base menu, Media item) {
		super(menu);
		this.item = item;
		options = Arrays.asList(
			"Add to cart",
			"Play"
		);
	}

	@Override
	protected void displayInfo() {
		System.out.println(item.toString());
		System.out.println();
	}

	@Override
	protected void handleChoice(int choice) {
		switch(choice) {
			case 1:
				cart.addMedia(item);
				scanner.nextLine();
				break;
			case 2:
				item.tryPlay();
				break;
		}
	}
}
