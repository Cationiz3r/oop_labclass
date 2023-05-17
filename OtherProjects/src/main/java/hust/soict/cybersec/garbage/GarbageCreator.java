package hust.soict.cybersec.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
	public static void main(String[] args) {
		var filename = "rick_roll.mp4";

		byte[] inputBytes = { 0 };
		try {
			inputBytes = Files.readAllBytes(Paths.get(filename));
		} catch (Exception e) {}
		var start = System.currentTimeMillis();

		var output = "";
		for (byte b: inputBytes) {
			output += (char)b;
		}
		System.out.println(System.currentTimeMillis() - start);
	}
}
