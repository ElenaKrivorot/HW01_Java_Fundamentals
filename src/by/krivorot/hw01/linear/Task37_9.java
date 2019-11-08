package by.krivorot.hw01.linear;

public class Task37_9 {

	public static void main(String[] args) {
		/*
		 * Составить линейную программу, печатающую значение true, если указанное
		 * высказывание является истинным, и false — в противном случае: График функции
		 * у = ах2 + bх+ с проходит через заданную точку с координатами (m, n).
		 */

		double a = 4;
		double b = 5;
		double c = 6;
		double m = 2;
		double n = 32;

		System.out.println((a * m * m + b * m + c) == n);
	}

}
