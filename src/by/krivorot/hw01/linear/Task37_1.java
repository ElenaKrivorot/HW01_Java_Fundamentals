package by.krivorot.hw01.linear;

public class Task37_1 {

	public static void main(String[] args) {
		/*
		 * Составить линейную программу, печатающую значение true, если указанное
		 * высказывание является истинным, и false — в противном случае:		 * 
		 * Целое число N является четным двузначным числом.
		 */

		int N = 122;
		int a;
		int b;
		double c;

		a = N / 10;
		b = N / 100;
		c = N % 2.0;

		System.out.println((a != 0) && (b == 0) && (c == 0));

	}

}
