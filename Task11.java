package by.krivorot.hw01.linear;

public class Task11 {

	public static void main(String[] args) {
		/*
		 * Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух
		 * катетов.
		 */

		double a = 3;
		double b = 4;
		double S;
		double P;

		S = 0.5 * a * b;
		P = a + b + (Math.pow(((a * a + b * b)), 0.5));

		System.out.println("Периметр равен " + P);
		System.out.println("Площадь равна " + S);

	}

}
