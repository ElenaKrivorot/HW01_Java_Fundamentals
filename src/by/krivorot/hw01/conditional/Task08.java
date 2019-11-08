package by.krivorot.hw01.conditional;

public class Task08 {

	public static void main(String[] args) {
		// Составить программу нахождения наименьшего из квадратов двух чисел а и b.

		double a = 2;
		double b = -3;

		a = a * a;
		b = b * b;

		if (a == b) {
			System.out.println("Квадраты чисел равны");
		} else if (a > b) {
			System.out.println("Наименьший квадрат у числа b. Он равен " + b);
		} else {
			System.out.println("Наименьший квадрат у числа a. Он равен " + a);
		}
	}

}
