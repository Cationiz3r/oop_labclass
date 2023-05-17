package hust.soict.cybersec.aims.test.disc;

import hust.soict.cybersec.aims.disc.DigitalVideoDisc;

class DVDWrapper {
	public DigitalVideoDisc dvd;

	public DVDWrapper(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}

	public void swap(DVDWrapper wrapper) {
		DigitalVideoDisc tmp = dvd;
		dvd = wrapper.dvd;
		wrapper.dvd = tmp;
	}
}

public class TestPassingParameter {
	public static void swap(Object o1, Object o2) {
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
	}

	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}

	public static void main(String[] args) {
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

		swap(jungleDVD, cinderellaDVD);
		System.out.println("Jungle DVD title: " + jungleDVD.getTitle());
		System.out.println("Cinderella DVD title: " + cinderellaDVD.getTitle());

		// changeTitle(jungleDVD, cinderellaDVD.getTitle());
		// System.out.println("Jungle DVD title: " + jungleDVD.getTitle());

		System.out.println("Swapping DVDs using wrappers...");
		var jungleWrapper = new DVDWrapper(jungleDVD);
		var cinderellaWrapper = new DVDWrapper(cinderellaDVD);

		jungleWrapper.swap(cinderellaWrapper);
		System.out.println("Jungle DVD title: " + jungleWrapper.dvd.getTitle());
		System.out.println("Cinderella DVD title: " + cinderellaWrapper.dvd.getTitle());
	}
}
