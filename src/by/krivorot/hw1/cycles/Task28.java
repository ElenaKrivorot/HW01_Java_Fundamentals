package by.krivorot.hw1.cycles;

import java.util.Scanner;

public class Task28 {

	public static void main(String[] args) {
		/*
		 * Написать программу, в которой вводятся два операнда Х и Y и знак операции (+,
		 * –, /, *). Вычислить результат Z в зависимости от знака. Предусмотреть реакции
		 * на возможный неверный знак операции, а также на ввод Y=0 при делении.
		 * Организовать возможность многократных вычислений без перезагрузки программа
		 * (т.е. построить цикл). В качестве символа прекращения вычислений принять ‘0’.
		 */

		double x;
		double y = 0;
		char ch = 0;
		char ch1;
		int j = 0;
		int k = 0;
		int q = 0;
		double z = 0;

		Scanner sc = new Scanner(System.in);

		while (j == 0) {
			System.out.println("Введите первое число X");

			while (!sc.hasNextDouble()) {
				sc.next();
				System.out.println("Введено некорректное число. Введите число типа double");
			}

			x = sc.nextDouble();

			while (k == 0) {
				System.out.println("Введите второе число Y");
				while (!sc.hasNextDouble()) {
					sc.next();
					System.out.println("Введено некорректное число. Введите число типа double");
				}
				y = sc.nextDouble();

				while (q == 0) {
					System.out.println("Введите знак операции +, -, /, *");
					ch = sc.next().charAt(0);
					if ((ch != '/') && (ch != '*') && (ch != '-') && (ch != '+')) {
						System.out.println("Введен некорректный оператор. Повторите ввод оператора");
					} else {
						q = 1;
					}
				}

				if ((ch == '/') && (y == 0)) {
					System.out.println("На ноль делить нельзя. Повторите введение Y и оператора");
					q = 0;
				} else {
					k = 1;
				}

			}

			k = 0;
			q = 0;

			if (ch == '/') {
				z = x / y;
			}
			if (ch == '*') {
				z = x * y;
			}
			if (ch == '-') {
				z = x - y;
			}
			if (ch == '+') {
				z = x + y;
			}

			System.out.println("Ответ: " + z);
			System.out.println("Чтобы остановить вычисления введите '0', чтобы продолжить - введите любой символ");
			ch1 = sc.next().charAt(0);
			if (ch1 == '0') {
				j = 1;
			}

		}
		sc.close();
	}

}
