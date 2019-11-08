package by.krivorot.hw01.linear;

public class Task36 {

	public static void main(String[] args) {
		// Найти частное произведений четных и нечетных цифр четырехзначного числа.

		int X = 1234;
		int a;
		int b;
		int c;
		int d;
		double y;

		a = X % 10;
		X = X / 10;
		b = X % 10;
		X = X / 10;
		c = X % 10;
		X = X / 10;
		d = X % 10;

		y = (a * c) / (1.0 * b * d);

		System.out.println("Частное равно " + y);

	}

}
