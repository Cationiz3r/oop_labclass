package hust.soict.dsai.aims.media.comparator;

import java.util.Comparator;
import hust.soict.dsai.aims.media.Media;

public class ByCostTitle
implements Comparator<Media> {
	@Override
	public int compare(Media a, Media b) {
		if (a.getCost() != b.getCost())
			return Float.compare(a.getCost(), b.getCost());
		return a.getTitle().compareTo(b.getTitle());
	}
}
