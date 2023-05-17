package hust.soict.cybersec.aims.media;

import java.util.Comparator;
import hust.soict.cybersec.aims.media.comparator.ByCostTitle;
import hust.soict.cybersec.aims.media.comparator.ByTitleCost;

public abstract class Media {
	private static int nItems = 0;
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new ByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new ByCostTitle();

	protected int id;
	protected String title;
	protected String category;
	protected float cost;

	public Media(String title, String category, float cost) {
		id = nItems++;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	public int getId() { return id; }
	public String getTitle() { return title; }
	public String getCategory() { return category; }
	public float getCost() { return cost; }

	@Override
	public boolean equals(Object obj) {
		Media media = (Media)obj;
		return title == media.title;
	}

	public void tryPlay() {
		if (!(this instanceof Playable)) {
			System.out.println("Item is not playable");
			return;
		}
		var playable = (Playable)this;
		playable.play();
	}

	public boolean matchId(int id) { return this.id == id; }
	public boolean matchTitle(String title) { return this.title.equals(title); }

	@Override
	public abstract String toString();
}
