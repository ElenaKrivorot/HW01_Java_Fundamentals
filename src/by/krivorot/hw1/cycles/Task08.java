package by.krivorot.hw1.cycles;

public class Task08 {

	public static void main(String[] args) {
		/*
		 * Вычислить значения функции на отрезке [а,b] c шагом h: y = (x+c)*2 при x =
		 * 15; y = (x-c)+6 при x != 15.
		 */

		double a = 11;
		double b = 16;
		double h = 1;
		double c = 2;
		double x;

		for (x = a; x <= b; x = x + h) {
			if (x == 15) {
				System.out.println("y = " + ((x + c) * 2) + "при x = " + x);
			} else {
				System.out.println("y = " + (x - c + 6) + " при x = " + x);
			}

		}

	}

}
