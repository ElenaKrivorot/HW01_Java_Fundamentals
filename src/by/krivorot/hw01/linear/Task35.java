package by.krivorot.hw01.linear;

public class Task35 {

	public static void main(String[] args) {
		/*
		 * Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую
		 * цифру целой части числа M/N.
		 */

		double M = 764;
		double N = 17;
		int c;
		int d;
		double x;

		x = Math.floor(M / N);
		c = (int) x % 10;
		d = (int)(M / N * 10) % 10;

		System.out.println("Младшая цифра целой части " + c);
		System.out.println("Старшая цифра дробной части " + d);
	}

}
