package by.krivorot.hw01.conditional;

public class Task32 {

	public static void main(String[] args) {
		/*
		 * Написать программу, которая по заданным трем числам определяет, является ли
		 * сумма каких-либо двух из них положительной.
		 */

		double a = -3;
		double b = -2;
		double c = 3;

		if ((a + b) > 0) {
			System.out.println("является");
		} else {
			if ((a + c) > 0) {
				System.out.println("является");
			} else {
				if ((b + c) > 0) {
					System.out.println("является");
				} else {
					System.out.println("не является");
				}
			}
		}

	}

}
