package by.krivorot.hw1.cycles;

public class Task38 {

	public static void main(String[] args) {
		/*
		 * Для заданного натурального числа определить, образуют ли его цифры
		 * арифметическую прогрессию. Предполагается, что в числе не менее трёх цифр.
		 * Например: 1357, 963.
		 */

		int n = 1357;
		int a1;
		int a2;
		int d;
		int i = 2;
		int an;

		a1 = n % 10;
		a2 = (n / 10) % 10;
		d = a2 - a1;
		n = n / 100;
		while (n / 10 > 0) {
			an = n % 10;
			if (an != (a1 + d * i)) {
				System.out.println("Арифметическую прогрессию не образуют");
			}
			i = i + 1;
			n = n / 10;
		}
		if (n != (a1 + d * i)) {
			System.out.println("Арифметическую прогрессию не образуют");
		} else {
			System.out.println("Арифметическую прогрессию образуют");
		}

	}

}
