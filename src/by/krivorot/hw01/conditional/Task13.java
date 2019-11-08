package by.krivorot.hw01.conditional;

public class Task13 {

	public static void main(String[] args) {
		/*
		 * Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий,
		 * которая из точек находится ближе к началу координат.
		 */

		double x1 = 6;
		double y1 = 7;
		double x2 = 8;
		double y2 = 4;
		double s1;
		double s2;

		s1 = Math.sqrt(x1 * x1 + y1 * y1);
		s2 = Math.sqrt(x2 * x2 + y2 * y2);

		if (s1 < s2) {
			System.out.println("Точка А ближе к началу координат");
		} else if (s1 > s2) {
			System.out.println("Точка В ближе к началу координат");
		} else {
			System.out.println("Точки равноудалены от начала координат");
		}
	}

}
