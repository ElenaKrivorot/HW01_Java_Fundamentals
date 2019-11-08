package by.krivorot.hw1.cycles;

import java.util.Scanner;

public class Task31 {

	public static void main(String[] args) {
		/*
		 * Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек
		 * пытается их угадать. Программа должна выводить угаданные и неугаданные числа
		 * из тех, что сгенерировала программа, а также ошибочные числа пользователя.
		 */

		int a = 1 + (int) (Math.random() * 15);
		int b = 1 + (int) (Math.random() * 15);
		int c = 1 + (int) (Math.random() * 15);
		int d = 1 + (int) (Math.random() * 15);
		int e = 1 + (int) (Math.random() * 15);
		int x;
		int i;

		Scanner sc = new Scanner(System.in);

		for (i = 1; i <= 5; i = i + 1) {
			System.out.println("Введите число");
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.println("Введено некорректное число. Введите число от 1 до 15");
			}
			x = sc.nextInt();
			if ((x < 1) || (x > 15)) {
				System.out.println(x + " - ошибочное число");
			} else if ((x == a) || (x == b) || (x == c) || (x == d) || (x == e)) {
				System.out.println(x + " - угаданное число");
				if (x == a) {
					a = 16;
					continue;
				}
				if (x == b) {
					b = 16;
					continue;
				}
				if (x == c) {
					c = 16;
					continue;
				}
				if (x == d) {
					d = 16;
					continue;
				}
				if (x == e) {
					e = 16;
					continue;
				}
			} else {
				System.out.println(x + " - неугаданное число");
			}

		}
		sc.close();
	}

}
