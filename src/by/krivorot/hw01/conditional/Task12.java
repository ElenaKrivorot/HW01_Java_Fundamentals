package by.krivorot.hw01.conditional;

public class Task12 {

	public static void main(String[] args) {
		/*
		 * Даны три действительных числа. Возвести в квадрат те из них, значения которых
		 * неотрицательны, и в четвертую степень — отрицательные.
		 */
		
		double a = -2;
		double b = 7;
		double c = 0;

		if (a < 0) {
			System.out.println(+ a*a*a*a);
		} else {
			System.out.println(+ a*a);
		}
		if (b < 0) {
			System.out.println(+ b*b*b*b);
		} else {
			System.out.println(+ b*b);
		}
		if (c < 0) {
			System.out.println(+ c*c*c*c);
		} else {
			System.out.println(+ c*c);
		}

	}

}
