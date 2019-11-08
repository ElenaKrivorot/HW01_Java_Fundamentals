package by.krivorot.hw01.conditional;

public class Task09 {

	public static void main(String[] args) {
		/*
		 * Составить программу, которая определит по трем введенным сторонам, является
		 * ли данный треугольник равносторонним.
		 */

		double a = 2;
		double b = 7;
		double c = 2;

		if ((a == b) && (b == c)) {
			System.out.println("Треугольник равносторонний");
		} else {
			System.out.println("Треугольник не равносторонний");
		}

	}

}
