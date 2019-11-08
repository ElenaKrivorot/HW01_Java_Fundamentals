package by.krivorot.hw01.linear;

public class Task40 {

	public static void main(String[] args) {
		/*
		 * Дано значение х. Получить значения -2х + 3х^2 - 4х^3 и 1 + 2х + 3х^2 + 4х^3 .
		 * Позаботьтесь об экономии операций.
		 */

		double x = 2;

		System.out.println((-2 + x * (3 - 4 * x) * x));
		System.out.println(1 + x * (2 + x * (3 + 4 * x)));

	}

}
