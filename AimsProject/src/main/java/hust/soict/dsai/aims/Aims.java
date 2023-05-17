package hust.soict.dsai.aims;

import java.util.Scanner;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.console.Main;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class Aims {
	public static void main(String[] args) {
		var cart = new Cart();
		var store = new Store();
		var scanner = new Scanner(System.in);

		store.addMedia(new DigitalVideoDisc("Title A", "Cate B", "Director C", 100, 20.0f));
		store.addMedia(new DigitalVideoDisc("Title B", "Cate B", "Director D", 120, 30.0f));
		store.addMedia(new Book("Title G", "Cate H", 5.0f));
		store.addMedia(new Book("Title I", "Cate J", 7.0f));

		var menu = new Main(store, cart, scanner);
		menu.display();
	}
}
