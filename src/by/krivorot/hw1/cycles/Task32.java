package by.krivorot.hw1.cycles;

import java.util.Scanner;

public class Task32 {

	public static void main(String[] args) {
		/*
		 * Проверить введенную пользователем строку на наличие недопустимых символов. В
		 * качестве первого символа допустимы только буквы и знак подчеркивания.
		 * Остальные символы могут быть буквами, цифрами и знаком подчеркивания.
		 */

		String s;
		int i;
		char x;
		int x1;

		System.out.println("Введите строку");
		Scanner sc = new Scanner(System.in);
		s = sc.next();

		x = s.charAt(0);
		x1 = (int) x;
		if ((x1 < 65) || ((x1 > 90) && (x1 < 97) && (x1 != 95)) || (x1 > 122)) {
			System.out.println("символ 1 не допустимый");
		}

		for (i = 1; i < s.length(); i = i + 1) {
			x = s.charAt(i);
			x1 = (int) x;
			if ((x1 < 48) || ((x1 > 57) && (x1 < 65)) || ((x1 > 90) && (x1 != 95) && (x1 < 97)) || (x1 > 122)) {
				System.out.println("символ " + (i + 1) + " недопустимый");
			}

		}
		sc.close();

	}

}
