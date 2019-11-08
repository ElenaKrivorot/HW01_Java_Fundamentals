package by.krivorot.hw01.linear;

public class Task24 {

	public static void main(String[] args) {
		/*
		 * Найти площадь равнобедренной трапеции с основаниями а и b и углом α при
		 * большем основании а.
		 */

		double a = 5;
		double b = 4;
		double x = 60;
		double S;

		x = Math.toRadians(x);
		S = 0.25 * (a * a - b * b) * Math.tan(x);

		System.out.println("Площадь трапеции равна " + S);

	}
}
