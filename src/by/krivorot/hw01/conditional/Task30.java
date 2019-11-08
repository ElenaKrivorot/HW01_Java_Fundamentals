package by.krivorot.hw01.conditional;

public class Task30 {

	public static void main(String[] args) {
		/*
		 * Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и
		 * заменить их абсолютными значениями, если это не так.
		 */

		double a = 3;
		double b = 2;
		double c = 2;

		if (a > b && b > c) {
			a = 2 * a;
			b = 2 * b;
			c = 2 * c;
		} else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
		}

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}

}
