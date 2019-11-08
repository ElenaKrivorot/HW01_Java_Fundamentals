package by.krivorot.hw1.cycles;

public class Task29 {

	public static void main(String[] args) {
		/*
		 * Даны два числа. Определить цифры, входящие в запись как первого так и второго
		 * числа.
		 */

		int x1 = 12024258;
		int x2 = 45054583;
		int xn;
		int an1;
		int an2;
		int r = 0;

		System.out.println("Цифры встречающиеся в записи обоих чисел:");
		while ((x1 / 10) != 0) {
			an1 = x1 % 10;
			if (an1 == r) {
				x1 = x1 / 10;
				continue;
			}
			xn = x2;
			while ((xn / 10) != 0) {
				an2 = xn % 10;
				if (an1 == an2) {
					System.out.println(an1);
					r = an1;
					break;
				}
				xn = xn / 10;
			}
			x1 = x1 / 10;
		}

	}

}
