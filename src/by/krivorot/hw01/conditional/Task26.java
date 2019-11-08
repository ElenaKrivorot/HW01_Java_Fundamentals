package by.krivorot.hw01.conditional;

public class Task26 {

	public static void main(String[] args) {
		// Написать программу нахождения суммы большего и меньшего из трех чисел.

		double a = 3;
		double b = 4;
		double c = 5;
		double max;
		double min;

		max = a;
		min = a;

		if (b >= max) {
			max = b;
		}
		if (c >= max) {
			max = c;
		}
		if (b <= min) {
			min = b;
		}
		if (c <= min) {
			min = c;
		}

		System.out.println(max + min);
	}

}
