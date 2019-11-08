package by.krivorot.hw1.cycles;

public class Task14 {

	public static void main(String[] args) {
		// Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.

		int i;
		double n = 14;
		double s = 0;

		for (i = 1; i <= n; i = i + 1) {
			s = s + 1.0 / i;
		}

		System.out.println(s);

	}

}
