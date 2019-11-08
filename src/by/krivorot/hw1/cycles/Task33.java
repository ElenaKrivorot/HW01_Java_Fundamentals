package by.krivorot.hw1.cycles;

public class Task33 {

	public static void main(String[] args) {
		// Найдите наибольшую цифру данного натурального числа.

		int n = 173473428;
		int max = 0;

		while ((n / 10) != 0) {
			if ((n % 10) > max) {
				max = n % 10;
			}
			n = n / 10;
		}
		if (n > max) {
			max = n;
		}
		System.out.println(max);

	}

}
