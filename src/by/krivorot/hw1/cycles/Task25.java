package by.krivorot.hw1.cycles;

import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {
		// Требуется определить факториал числа, которое ввел пользователь.

		int x = 0;
		int i;
		int s = 1;
		
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

		for (i = 2; i <= x; i = i + 1) {
			s = s * i;
		}
		System.out.println(s);
	}

}
