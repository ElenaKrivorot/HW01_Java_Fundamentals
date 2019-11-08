package by.krivorot.hw1.cycles;

public class Task15 {

	public static void main(String[] args) {
		// Вычислить : 1+2+4+8+...+ 2 в 10 степени.

		double i;
		double s = 0;

		for (i = 1; i <= 10; i = i + 1) {
			s = s + Math.pow(2, i);
		}

		System.out.println(s);

	}

}
