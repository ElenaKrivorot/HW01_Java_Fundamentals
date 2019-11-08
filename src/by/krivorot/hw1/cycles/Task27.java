package by.krivorot.hw1.cycles;

import java.util.Scanner;

public class Task27 {

	public static void main(String[] args) {
		/*
		 * Для каждого натурального числа в промежутке от m до n вывести все делители,
		 * кроме единицы и самого числа. m и n вводятся с клавиатуры.
		 */

		int m = 0;
		int n = 0;
		int k;
		int i;
		int j;

		System.out.println("Введите натуральное число m");

		Scanner sc = new Scanner(System.in);

		while (m <= 0) {
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.println("Введено некорректное число. Введите целое положительное m");
			}

			m = sc.nextInt();
			if (m <= 0) {
				System.out.println("Введено отрицательное число. Введите целое положительное m");
			}
		}

		System.out.println("Введите натуральное число n");

		while (n <= 0) {
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.println("Введено некорректное число. Введите целое положительное n");
			}

			n = sc.nextInt();
			if (n <= 0) {
				System.out.println("Введено отрицательное число. Введите целое положительное n");
			}
		}
		sc.close();

		if (n < m) {
			k = n;
			n = m;
			m = k;
		}

		for (i = m; i <= n; i = i + 1) {

			System.out.print("Делители числа " + i + " : ");
			for (j = 2; j <= i - 1; j = j + 1) {
				if ((i % j) == 0) {
					System.out.print(j + "; ");
				}

			}
			System.out.println();

		}

	}

}
