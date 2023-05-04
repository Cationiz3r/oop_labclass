package hust.soict.dsai.aims.media;

public class DigitalVideoDisc
extends Disc {
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, director, length, cost);
	}

	public String toString() {
		return "DVD - " + title + " - " + category + " - " + director +
			" - " + length + ": " + cost + "$";
	}
}
