package by.krivorot.hw01.conditional;

public class Task31 {

	public static void main(String[] args) {
		/*
		 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
		 * Определить, пройдет ли кирпич через отверстие.
		 */

		double A = 3;
		double B = 2;
		double x = 3;
		double y = 3;
		double z = 3;
		int i = 0;

		if (x <= A) {
			i = i + 1;
			if ((y <= B) || (z <= B)) {
				System.out.println("Кирпич пройдет через отверстие");
			} else {
				System.out.println("Кирпич не пройдет через отверстие");
			}
		}

		if ((y <= A) && (i == 0)) {
			i = i + 1;
			if ((x <= B) || (z <= B)) {
				System.out.println("Кирпич пройдет через отверстие");
			} else {
				System.out.println("Кирпич не пройдет через отверстие");
			}
		}

		if ((z <= A) && (i == 0)) {
			if ((y <= B) || (x <= B)) {
				System.out.println("Кирпич пройдет через отверстие");
			} else {
				System.out.println("Кирпич не пройдет через отверстие");
			}
		}

	}

}
