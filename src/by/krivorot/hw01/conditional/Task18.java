package by.krivorot.hw01.conditional;

public class Task18 {

	public static void main(String[] args) {
		// Подсчитать количество отрицательных среди чисел а, b, с.

		double a = 6;
		double b = 4;
		double c = 4;
		int i = 0;

		if (a < 0) {
			i = i + 1;
		}
		if (b < 0) {
			i = i + 1;
		}
		if (c < 0) {
			i = i + 1;
		}

		System.out.println("Количество отрицательных чисел равно " + i);

	}

}
