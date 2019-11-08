package by.krivorot.hw1.cycles;

public class Task23 {

	public static void main(String[] args) {
		/*
		 * Составить программу для вычисления значений функции F(x) на отрезке [а, b] с
		 * шагом h. Результат представить в виде таблицы, первый столбец которой –
		 * значения аргумента, второй - соответствующие значения функции:
		 * F(x)=ctg(x/3)+0.5*sin(x)
		 * 
		 */

		double a = Math.PI / 2;
		double b = Math.PI;
		double h = Math.PI / 8;
		double x;

		System.out.println("___________________");
		System.out.println("    x   |    F(x)  |");
		System.out.println("________|__________|");

		for (x = a; x <= b; x = x + h) {

			System.out.printf("   %.2f |    %.2f  |\n", x, (1/(Math.tan(x/3))+0.5*Math.sin(x)));
			System.out.println("________|__________|");

		}

	}

}
