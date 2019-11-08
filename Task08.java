package by.krivorot.hw01.linear;

public class Task08 {

	public static void main(String[] args) {
		/*
		 * Вычислить значение выражения по формуле (все переменные принимают
		 * действительные значения): (b + (b ^ 2 + 4 * a * c) ^ 1/2) / 2 * a - a ^ 3 * c
		 * + b ^ (-2)
		 */

		double a = 4;
		double b = 1;
		double c = 2;
		double y;

		y = (b + Math.pow((Math.pow(b, 2) + 4 * a * c), 0.5)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, (-2));

		System.out.println("значение выражения равняется " + y);
	}

}
