package by.krivorot.hw01.linear;

public class Task37_5 {

	public static void main(String[] args) {
		/*
		 * Составить линейную программу, печатающую значение true, если указанное
		 * высказывание является истинным, и false — в противном случае: Квадрат
		 * заданного трехзначного числа равен кубу суммы цифр этого числа.
		 */

		int N = 136;
		int N1;
		int a;
		int b;
		int c;
		double d;

		N1 = N * N;
		a = N % 10;
		N = N / 10;
		b = N % 10;
		c = N / 10;
		d = Math.pow((a + b + c), 3);

		System.out.println(d == N1);

	}

}
