package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc
extends Disc {
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<>();

	public String getArtist() { return artist; }
	public ArrayList<Track> getTracks() { return tracks; }
}
