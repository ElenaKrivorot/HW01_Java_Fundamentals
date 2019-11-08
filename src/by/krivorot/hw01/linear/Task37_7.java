package by.krivorot.hw01.linear;

public class Task37_7 {

	public static void main(String[] args) {
		/*
		 * Составить линейную программу, печатающую значение true, если указанное
		 * высказывание является истинным, и false — в противном случае: Сумма
		 * каких-либо двух цифр заданного трехзначного натурального числа N равна
		 * третьей цифре.
		 */

		int N = 134;
		int a;
		int b;
		int c;

		a = N % 10;
		N = N / 10;
		b = N % 10;
		c = N / 10;

		System.out.println(((a + b) == c) || ((a + c) == b) || ((b + c) == a));

	}

}
