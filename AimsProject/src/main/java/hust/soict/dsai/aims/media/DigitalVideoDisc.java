package hust.soict.dsai.aims.media;

public class DigitalVideoDisc
extends Disc {
	private static int nbDigitalVideoDiscs = 0;

	public DigitalVideoDisc(String title) {
		this.title = title;
		this.id = nbDigitalVideoDiscs;
		nbDigitalVideoDiscs++;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		this(title);
		this.category = category;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		this(title, category, cost);
		this.director = director;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		this(title, category, director, cost);
		this.length = length;
	}

	public void setTitle(String title) { this.title = title; }

	public boolean isMatch(String title) {
		return this.title == title;
	}

	public String toString() {
		return "DVD - " + title + " - " + category + " - " + director +
			" - " + length + ": " + cost + "$";
	}
}
