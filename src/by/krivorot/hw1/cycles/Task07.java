package by.krivorot.hw1.cycles;

public class Task07 {

	public static void main(String[] args) {
		/*
		 * Вычислить значения функции на отрезке [а,b] c шагом h:
		 * y = x при x > 2; y = -x при x <= 2.
		 */

		double a = 1;
		double b = 4;
		double h = 1;
		double x;

		for (x = a; x <= b; x = x + h) {
			if (x <= 2) {
				System.out.println("y = " + (-x) + " при x = " + x);
			} else {
				System.out.println("y = " + x + " при x = " + x);
			}

		}

	}

}
