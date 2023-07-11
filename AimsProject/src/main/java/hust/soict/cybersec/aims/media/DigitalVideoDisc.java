package hust.soict.cybersec.aims.media;

public class DigitalVideoDisc
extends Disc {
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, director, length, cost);
	}

	@Override
	public String toString() {
		return "DVD - " + title + " - " + category + " - " + director +
			" - " + length + ": " + cost + "$";
	}

	public void play() {
		System.out.println("Playing DVD: " + title);
		System.out.println("DVD length: " + length);
	}
}
