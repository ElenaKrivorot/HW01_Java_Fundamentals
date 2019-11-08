package by.krivorot.hw01.conditional;

public class Task07 {

	public static void main(String[] args) {
		/*
		 * Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных
		 * значениях a, b, c и х
		 */

		double a = -2;
		double b = -7;
		double c = 2;
		double x = 2;
		double y;

		y = a * Math.pow(x, 2) + b * x + c;

		if (y < 0) {
			System.out.println("Модуль выражения a*x*x + b*x + c равен " + -y);
		} else {
			System.out.println("Модуль выражения a*x*x + b*x + c равен " + y);
		}

	}

}
