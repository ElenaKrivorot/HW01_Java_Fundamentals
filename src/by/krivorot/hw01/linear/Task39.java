package by.krivorot.hw01.linear;

public class Task39 {

	public static void main(String[] args) {
		/*
		 * Дано действительное число х. Не пользуясь никакими другими арифметическими
		 * операциями, кроме умножения, сложения и вычитания, вычислите за минимальное
		 * число операций: 2x^4 - 3x^3 + 4x^2 - 5x + 6.
		 */

		double x = 2;
		
		System.out.println((((2 * x  - 3)*x + 4 )* x - 5) * x + 6);

	}

}
