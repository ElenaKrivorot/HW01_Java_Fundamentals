package by.krivorot.hw01.conditional;

import java.util.Scanner;

public class Task23 {

	public static void main(String[] args) {
		/*
		 * Определить правильность даты, введенной с клавиатуры (число — от 1 до 31,
		 * месяц — от 1 до 12). Если введены некорректные данные, то сообщить об этом.
		 */

		int ch;
		int m;

		System.out.println("Введите число ");
		Scanner sc = new Scanner(System.in);
		ch = sc.nextInt();
		System.out.println("Введите месяц ");
		m = sc.nextInt();
		sc.close();
		if ((ch < 1) || (ch > 31) || (m < 1) || (ch > 12)) {
			System.out.println("Дата введена неверно");
		} else {
			System.out.println("Дата корректна");
		}

	}

}
