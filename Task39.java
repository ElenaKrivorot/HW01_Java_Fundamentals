package by.krivorot.hw01.linear;

public class Task39 {

	public static void main(String[] args) {
		/*
		 * ƒано действительное число х. Ќе пользу€сь никакими другими арифметическими
		 * операци€ми, кроме умножени€, сложени€ и вычитани€, вычислите за минимальное
		 * число операций: 2x4 - 3х3 + 4х2 - 5х + 6.
		 */

		double x = 2;
		double x1;

		x1 = x * x;

		System.out.println(+((2 * x * x1 - 3 * x1 + 4 * x - 5) * x + 6));

	}

}
