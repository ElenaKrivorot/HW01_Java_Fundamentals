package by.krivorot.hw1.cycles;

import java.math.BigInteger;

public class Task10 {

	public static void main(String[] args) {
		// Составить программу нахождения произведения квадратов первых двухсот чисел.

		int i;
		BigInteger a = BigInteger.valueOf(1);
		BigInteger s = BigInteger.valueOf(1);

		for (i = 1; i <= 200; i = i + 1) {
			a = BigInteger.valueOf(i * i);
			s = s.multiply(a);
		}
		System.out.println(s);

	}

}
