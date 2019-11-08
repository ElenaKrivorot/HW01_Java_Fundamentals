package by.krivorot.hw1.cycles;

public class Task35 {

	public static void main(String[] args) {
		// Найдите количество четных цифр данного натурального числа

		int j;
		int n = 83245;
		int s = 0;

		while (n / 10 > 0) {
			j = n % 10;
			if (j % 2 == 0) {
				s = s + 1;
			}
			n = n / 10;
		}
		if (n % 2 == 0) {
			s = s + 1;
		}
		System.out.println(s);

	}

}
