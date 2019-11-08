package by.krivorot.hw01.conditional;

public class Task17 {

	public static void main(String[] args) {
		/*
		 * Даны целые числа m, n. Если числа не равны, то заменить каждое из них одним и
		 * тем же числом, равным большему из исходных, а если равны, то заменить числа
		 * нулями.
		 */

		int m = 30;
		int n = 30;

		if (m != n) {
			if (m > n) {
				n = m;
			} else {
				m = n;
			}
		} else {
			m = n = 0;
		}

		System.out.println("m = " + m);
		System.out.println("n = " + n);

	}

}
