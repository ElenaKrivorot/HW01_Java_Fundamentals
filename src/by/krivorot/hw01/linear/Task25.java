package by.krivorot.hw01.linear;

public class Task25 {

	public static void main(String[] args) {
		/*
		 * Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными
		 * коэффициентами a, b и с (предполагается, что а≠0 и что дискриминант уравнения
		 * неотрицателен).
		 */

		double a = 5;
		double b = 8;
		double c = 3;
		double x1;
		double x2;

		x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

		System.out.print("Корни квадратного уравнения равны " + x1);
		System.out.print(" и " + x2);

	}

}
