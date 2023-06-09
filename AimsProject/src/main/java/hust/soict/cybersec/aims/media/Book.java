package hust.soict.cybersec.aims.media;

import java.util.ArrayList;

public class Book
extends Media {
	private ArrayList<String> authors = new ArrayList<String>();

	public Book(String title, String category, float cost) {
		super(title, category, cost);
	}

	public ArrayList<String> getAuthors() { return authors; }

	public boolean isAuthor(String authorName) {
		return authors.contains(authorName);
	}
	public void addAuthor(String authorName) {
		if (isAuthor(authorName)) {
			System.out.println("Author is already in the list");
			return;
		}
		authors.add(authorName);
		System.out.println("Author has been added to the list");
	}
	public void removeAuthor(String authorName) {
		if (!isAuthor(authorName)) {
			System.out.println("Author is not in the list");
			return;
		}
		authors.remove(authorName);
		System.out.println("Author has been removed from the list");
	}

	@Override
	public String toString() {
		return "Book - " + title + " - " + category + ": " + cost + "$";
	}
}
