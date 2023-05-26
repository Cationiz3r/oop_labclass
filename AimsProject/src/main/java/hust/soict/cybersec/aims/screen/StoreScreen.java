package hust.soict.cybersec.aims.screen;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import hust.soict.cybersec.aims.console.Store;

public class StoreScreen
extends JFrame {
	private Store store;

	public StoreScreen(Store store) {
		this.store = store;

		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());

		setVisible(true);
		setTitle("Store");
		setSize(1024, 768);
	}
}
