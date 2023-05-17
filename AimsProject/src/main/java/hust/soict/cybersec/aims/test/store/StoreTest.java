package hust.soict.cybersec.aims.test.store;

import hust.soict.cybersec.aims.store.Store;
import hust.soict.cybersec.aims.disc.DigitalVideoDisc;

public class StoreTest {
	public static void main(String[] args) {
		var store = new Store();

		var dvd1 = new DigitalVideoDisc("Some disc");

		store.addDVD(dvd1);
		store.removeDVD(dvd1);
	}
}
