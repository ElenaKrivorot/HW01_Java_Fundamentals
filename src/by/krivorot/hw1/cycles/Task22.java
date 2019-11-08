package by.krivorot.hw1.cycles;

public class Task22 {

	public static void main(String[] args) {
		/*
		 * Составить программу для вычисления значений функции F(x) на отрезке [а, b] с
		 * шагом h. Результат представить в виде таблицы, первый столбец которой –
		 * значения аргумента, второй - соответствующие значения функции: F(x) = sin^2(x)
		 */

		double a = Math.PI / 2;
		double b = Math.PI;
		double h = Math.PI / 8;
		double x;

		System.out.println("___________________");
		System.out.println("    x   |    F(x)  |");
		System.out.println("________|__________|");

		for (x = a; x <= b; x = x + h) {

			System.out.printf("   %.2f |    %.2f  |\n", x, (Math.pow(Math.sin(x), 2)));
			System.out.println("________|__________|");

		}

	}

}
