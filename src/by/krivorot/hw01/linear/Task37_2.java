package by.krivorot.hw01.linear;

public class Task37_2 {

	public static void main(String[] args) {
		/*
		 * Составить линейную программу, печатающую значение true, если указанное
		 * высказывание является истинным, и false — в противном случае: Сумма двух
		 * первых цифр заданного четырехзначного числа равна сумме двух его последних
		 * цифр.
		 */

		int N = 4536;
		int a;
		int b;
		int c;
		int d;

		a = N % 10;
		N = N / 10;
		b = N % 10;
		N = N / 10;
		c = N % 10;
		d = N / 10;

		System.out.println((a + b) == (c + d));

	}

}
