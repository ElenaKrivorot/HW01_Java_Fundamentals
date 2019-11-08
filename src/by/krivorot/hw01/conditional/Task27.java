package by.krivorot.hw01.conditional;

public class Task27 {

	public static void main(String[] args) {
		// Найти max{min(a, b), min(c, d)}.

		double a = 3;
		double b = 4;
		double c = 5;
		double d = 3;
		double min1 = a;
		double min2 = c;
		double max;

		if (b < min1) {
			min1 = b;
		}
		if (d < min2) {
			min2 = d;
		}

		max = min1;
		if (min2 > min1) {
			max = min2;
		}

		System.out.println(max);

	}

}
