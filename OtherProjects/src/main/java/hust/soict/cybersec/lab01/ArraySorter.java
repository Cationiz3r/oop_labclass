package hust.soict.cybersec.lab01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArraySorter {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		System.out.print("N = ");
		var n = scanner.nextInt();
		var arr = new ArrayList<Double>();

		for (int i = 0; i < n; ++i) {
			System.out.print("A[" + i + "] = ");
			arr.add(scanner.nextDouble());
		}

		scanner.close();

		arr.sort(Comparator.naturalOrder());
		System.out.println("A = " + arr.toString());

		var sum = arr.stream().mapToDouble(Double::doubleValue).sum();
		System.out.println("Sum = " + sum);

		var avg = arr.stream().mapToDouble(Double::doubleValue).average();
		System.out.println("Average = " + (avg.isPresent() ? avg.getAsDouble() : "null"));
	}
}
