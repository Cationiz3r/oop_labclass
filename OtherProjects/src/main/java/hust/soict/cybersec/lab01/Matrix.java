package hust.soict.cybersec.lab01;

import java.util.Scanner;

public class Matrix {
	public double[][] arr;

	public Matrix(int m, int n) {
		arr = new double[m][n];
	}

	public int getWidth() { return arr[0].length; }
	public int getHeight() { return arr.length; }

	public void setCellsFromStdin(Scanner scanner) {
		for (int i = 0; i < getHeight(); ++i)
			for (int j = 0; j < getWidth(); ++j) {
				System.out.print("A[" + i + "][" + j + "] = ");
				arr[i][j] = scanner.nextDouble();
			}
	}

	public Matrix add(Matrix other) {
		// Throw exception if dimension differs
		Matrix result = new Matrix(getHeight(), getWidth());
		for (int i = 0; i < getHeight(); ++i)
			for (int j = 0; j < getWidth(); ++j)
				result.arr[i][j] = arr[i][j] + other.arr[i][j];
		return result;
	}

	public void print() {
		for (int i = 0; i < getHeight(); ++i) {
			System.out.print(i == 0 ? "[[" : " [");
			for (int j = 0; j < getWidth(); ++j) {
				System.out.print(j == 0 ? "" : ", ");
				System.out.print(arr[i][j]);
			}
			System.out.println(i == (getHeight() - 1)? "]]" : "]");
		}
	}

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		System.out.println("Input matrix dimension of size M x N:");
		System.out.print("M = "); var m = scanner.nextInt();
		System.out.print("N = "); var n = scanner.nextInt();

		var mt1 = new Matrix(m, n);
		System.out.println("Set values for matrix 1:");
		mt1.setCellsFromStdin(scanner);

		var mt2 = new Matrix(m, n);
		System.out.println("Set values for matrix 2:");
		mt2.setCellsFromStdin(scanner);

		scanner.close();

		System.out.println("Matrix addition:");
		mt1.print();
		System.out.println("+");
		mt2.print();
		System.out.println("=");
		mt1.add(mt2).print();
	}
}
