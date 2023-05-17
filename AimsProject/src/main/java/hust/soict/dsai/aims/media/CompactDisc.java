package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc
extends Disc {
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<>();

	public String getArtist() { return artist; }
	public ArrayList<Track> getTracks() { return tracks; }

	@Override
	public int getLength() {
		return tracks.stream().mapToInt(t -> t.getLength()).sum();
	}

	public void addTrack(Track track) {
		if (tracks.contains(track)) {
			return;
		}
		tracks.add(track);
	}
	public void removeTrack(Track track) {
		if (!tracks.contains(track)) {
			return;
		}
		tracks.remove(track);
	}
}
