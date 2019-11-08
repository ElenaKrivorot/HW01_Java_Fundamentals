package by.krivorot.hw01.linear;

public class Task37_8 {

	public static void main(String[] args) {
		/*
		 * Составить линейную программу, печатающую значение true, если указанное
		 * высказывание является истинным, и false — в противном случае: Заданное число
		 * N является степенью числа а (показатель степени может находиться в диапазоне
		 * от 0 до 4).
		 */

		int N = 125;
		int a = 5;

		System.out.println((Math.pow(a, 0) == N) || (Math.pow(a, 1) == N) || (Math.pow(a, 2) == N)
				|| (Math.pow(a, 3) == N) || (Math.pow(a, 4) == N));
	}

}
