package by.krivorot.hw01.conditional;

import java.util.Scanner;

public class Task34 {

	public static void main(String[] args) {
		/*
		 * Составить программу, реализующую эпизод применения компьютера в книжном
		 * магазине. Компьютер запрашивает стоимость книг, сумму денег, внесенную
		 * покупателем; если сдачи не требуется, печатает на экране «спасибо»; если
		 * денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и
		 * указывает сумму сдачи; если денег недостаточно, то печатает сообщение об этом
		 * и указывает размер недостающей суммы.
		 */

		double S;
		double P;

		System.out.println("Введите стоимость книг ");
		Scanner sc = new Scanner(System.in);
		S = sc.nextDouble();
		System.out.println("Введите внесенную сумму ");
		P = sc.nextDouble();
		sc.close();

		if (P == S) {
			System.out.println("Спасибо");
		}
		if (P < S) {
			System.out.printf("Внесенной суммы не достаточно, доплатите %.2f", (S - P));
		}
		if (P > S) {
			System.out.printf("Возьмите сдачу %.2f", (P - S));
		}

	}

}
