package by.krivorot.hw1.cycles;

import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		/*
		 * Вводится натуральное число. Найти сумму четных цифр, входящих в его состав.
		 * Преобразовать его в другое число, цифры которого будут следовать в обратном
		 * порядке по сравнению с введенным числом.
		 */

		int x = 0;
		int x1;
		double x2 = 0;
		double i = 0;
		int s = 0;
		int an;

		System.out.println("Введите целое положительное число");

		Scanner sc = new Scanner(System.in);

		while (x <= 0) {
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.println("Введено не целое число. Введите целое положительное число");
			}

			x = sc.nextInt();
			if (x <= 0) {
				System.out.println("Введено не положительное число. Введите целое положительное число");
			}
		}

		sc.close();

		x1 = x;

		while ((x / 10) != 0) {
			i = i + 1;
			an = x % 10;
			x = x / 10;
			if ((an % 2) == 0) {
				s = s + an;
			}
		}
		if ((x % 2) == 0) {
			s = s + x;
		}
		while (i > 0) {
			an = x1 % 10;
			x2 = x2 + an * Math.pow(10, i);
			i = i - 1;
			x1 = x1 / 10;
		}
		x2 = x2 + x1;

		System.out.println("Сумма четных цифр:  " + s);
		System.out.println("Преобразованное число: " + (int) x2);
	}

}
