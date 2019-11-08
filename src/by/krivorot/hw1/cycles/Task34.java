package by.krivorot.hw1.cycles;

public class Task34 {

	public static void main(String[] args) {
		// Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15.

		int i;
		int j;
		int k;
		int s = 0;

		for (i = 1000; i <= 9999; i = i + 1) {
			k = i;
			for (j = 1; j <= 4; j = j + 1) {
				s = s + k % 10;
				k = k / 10;
			}
			if (s == 15) {
				System.out.println(i);
			}
			s = 0;
		}

	}

}
