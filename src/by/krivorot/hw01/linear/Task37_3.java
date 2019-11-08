package by.krivorot.hw01.linear;

public class Task37_3 {

	public static void main(String[] args) {
		/*
		 * Составить линейную программу, печатающую значение true, если указанное
		 * высказывание является истинным, и false — в противном случае: Сумма цифр
		 * данного трехзначного числа N является четным числом.
		 */

		int N = 536;
		int a;
		int b;
		int c;
		double d;

		a = N % 10;
		N = N / 10;
		b = N % 10;
		c = N / 10;
		d = (a + b + c) % 2.0;

		System.out.println(d == 0);

	}

}
