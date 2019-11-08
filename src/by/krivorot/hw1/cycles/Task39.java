package by.krivorot.hw1.cycles;

public class Task39 {

	public static void main(String[] args) {
		/*
		 * В трехзначном числе зачеркнули старшую цифру. Когда полученное число умножили
		 * на 7, то получили исходное число. Найти это число.
		 */

		int n;
		int i;

		for (i = 100; i <= 999; i = i + 1) {
			n = i / 100;
			n = i - n * 100;
			if (n * 7 == i) {
				System.out.println(i);
			}

		}
	}

}
