package hust.soict.cybersec.garbage;

import java.util.Random;

public class ConcatenationInLoops {
	public static void main(String[] args) {
		var r = new Random(123);
		var start = System.currentTimeMillis();

		String s = "";
		for (int i = 0; i < 65536; ++i)
			s += r.nextInt(2);
		System.out.println(System.currentTimeMillis() - start); // ~4500

		r = new Random(123);
		start = System.currentTimeMillis();
		var sb = new StringBuilder();
		for (int i = 0; i < 65536; ++i)
			sb.append(r.nextInt(2));
		System.out.println(System.currentTimeMillis() - start); // ~5
	}
}
