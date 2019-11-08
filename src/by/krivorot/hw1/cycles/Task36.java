package by.krivorot.hw1.cycles;

public class Task36 {

	public static void main(String[] args) {
		/*
		 * Два двузначных числа, записанных одно за другим , образуют четырёхзначное
		 * число, которое делится на их произведение. Найти эти числа.
		 */

		int j;
		int n;
		int i;
		int p;

		for (i = 1000; i <= 9999; i = i + 1) {
			j = i % 100;
			n = i / 100;
			p = j*n;
			if ((p!=0)&&(i % p == 0)) {
				System.out.println(n + " " + j);
			}

		}

	}

}
