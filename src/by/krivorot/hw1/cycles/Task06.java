package by.krivorot.hw1.cycles;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		/*
		 * Напишите программу, где пользователь вводит любое целое положительное число.
		 * А программа суммирует все числа от 1 до введенного пользователем числа.
		 */

		int x = 0;
		int a = 1;
		int s = 0;

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

		while (a <= x) {
			s = s + a;
			a = a + 1;
		}
		System.out.println(s);

	}

}
