package hust.soict.cybersec.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
	public static void main(String[] args) {
		var filename = "rick_roll.mp4";

		byte[] inputBytes = { 0 };
		try {
			inputBytes = Files.readAllBytes(Paths.get(filename));
		} catch (Exception e) {}
		var start = System.currentTimeMillis();

		var sb = new StringBuilder();
		for (byte b: inputBytes) {
			sb.append((char)b);
		}
		System.out.println(System.currentTimeMillis() - start);
	}
}
