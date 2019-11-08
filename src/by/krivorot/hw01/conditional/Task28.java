package by.krivorot.hw01.conditional;

public class Task28 {

	public static void main(String[] args) {
		/*
		 * Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не
		 * равно d, то найти max(d — a, d — b, d — c).
		 */

		double a = 6;
		double b = 4;
		double c = 5;
		double d = 3;
		double max = 0;

		if (a == d) {
			max = a;
			System.out.println("Число a равно d");
		}
		if (b == d) {
			max = b;
			System.out.println("Число b равно d");
		}
		if (c == d) {
			max = c;
			System.out.println("Число c равно d");
		}
		if (max == 0) {
			max = d - a;
			if ((d - b) > max) {
				max = d - b;
			}
			if ((d - c) > max) {
				max = d - c;
			}
			System.out.println("Максимальная разность равна " + max);
		}

	}

}
