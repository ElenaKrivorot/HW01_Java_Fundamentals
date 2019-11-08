package by.krivorot.hw01.linear;

public class Task27 {

	public static void main(String[] args) {
		/*
		 * Дано значение a. Не используя никаких функций и никаких операций, кроме
		 * умножения, получить значение а8 за три операции и а10 за четыре операции.
		 */

		double a = 2;
		double a2;
		double a4;
		double a8;
		double a10;

		a2 = a * a;
		a4 = a2 * a2;
		a8 = a4 * a4;
		a10 = a8 * a2;

		System.out.println("a^8 = " + a8);
		System.out.println("a^10 = " + a10);

	}

}
