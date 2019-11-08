package by.krivorot.hw01.conditional;

public class Task06 {

	public static void main(String[] args) {
		// Составить программу: определения наибольшего из двух чисел а и b.

		double a = 2;
		double b = -2;

		if (a == b) {
			System.out.println("Числа равны");
		} else if (a > b) {
			System.out.println("Наибольшее число " + a);
		} else {
			System.out.println("Наибольшее число " + b);
		}
	}

}
