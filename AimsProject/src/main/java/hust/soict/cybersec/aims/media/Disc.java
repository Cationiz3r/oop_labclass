package hust.soict.cybersec.aims.media;

public abstract class Disc
extends Media
implements Playable {
	protected String director;
	protected int length;

	public Disc(String title, String category, String director, int length, float cost) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
	}

	public String getDirector() { return director; }
	public int getLength() { return length; }

	@Override
	public String toString() {
		return "Disc - " + title + " - " + category + " - " + director +
			" - " + length + ": " + cost + "$";
	}
}
