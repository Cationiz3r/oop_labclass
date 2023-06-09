package hust.soict.cybersec.aims.media.comparator;

import java.util.Comparator;
import hust.soict.cybersec.aims.media.Media;

public class ByTitleCost
implements Comparator<Media> {
	@Override
	public int compare(Media a, Media b) {
		int titleCompare = a.getTitle().compareTo(b.getTitle());
		if (titleCompare != 0) return titleCompare;
		return Float.compare(a.getCost(), b.getCost());
	}
}
