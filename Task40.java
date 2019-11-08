package by.krivorot.hw01.linear;

public class Task40 {

	public static void main(String[] args) {
		/*
		 * Дано значение х. Получить значения -2х + 3х2 - 4х3 и 1 + 2х + 3х2 + 4х3 .
		 * Позаботьтесь об экономии операций.
		 */

		double x = 2;
		double x1;

		x1 = x * x;

		System.out.println(+((-2 + 3 * x - 4 * x1) * x));
		System.out.println(+(1 + (2 + 3 * x + 4 * x1) * x));

	}

}
