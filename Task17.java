package by.krivorot.hw01.linear;

public class Task17 {

	public static void main(String[] args) {
		/*
		 * Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее
		 * геометрическое модулей этих чисел.
		 */

		double x1 = 2;
		double x2 = -4;
		double y1;
		double y2;

		y1 = (Math.pow(x1, 3) + Math.pow(x2, 3)) / 2;
		y2 = Math.sqrt(Math.abs(x1) * Math.abs(x2));

		System.out.println("Среднее арифметическое кубов равно " + y1);
		System.out.println("Среднее геометрическое модулей равно " + y2);

	}

}
