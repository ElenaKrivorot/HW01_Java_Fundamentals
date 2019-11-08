package by.krivorot.hw1.cycles;

public class Task40 {

	public static void main(String[] args) {
		/*
		 * Получить все числа, не превышающие заданного числа N, которые делятся без
		 * остатка на все свои цифры. (Числа содержащие 0 не учитываются, т.к. на ноль
		 * делить нельзя)
		 */

		int n = 1000;
		int i;
		int j;
		int a;
		int k = 0;

		for (i = 1; i <= n; i = i + 1) {
			j = i;
			while (j / 10 > 0) {
				a = j % 10;
				if ((a == 0) || (i % a != 0)) {
					k = 1;
					break;
				}
				j = j / 10;
			}
			if ((i % j == 0) && (k == 0)) {
				System.out.println(i);
			}
			k = 0;
		}
	}

}
