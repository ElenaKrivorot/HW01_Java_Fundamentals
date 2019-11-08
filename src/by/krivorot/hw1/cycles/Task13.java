package by.krivorot.hw1.cycles;

public class Task13 {

	public static void main(String[] args) {
		/*
		 * Составить таблицу значений функции y = 5 - x^2 / 2 на отрезке [-5; 5] с шагом
		 * 0.5.
		 */

		double x;

		for (x = -5; x <= 5; x = x + 0.5) {
			System.out.println("y = " + (5 - x * x / 2));
		}

	}

}
