package by.krivorot.hw01.conditional;

public class Task29 {

	public static void main(String[] args) {
		/*
		 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они
		 * расположены на одной прямой.
		 */

		double x1 = 1;
		double y1 = 1;
		double x2 = 2;
		double y2 = 2;
		double x3 = 3;
		double y3 = 4;

		if (((x1 - x3) * (y2 - y3)) == ((x2 - x3) * (y1 - y3))) {
			System.out.println("Точки лежат на одной прямой");
		} else {
			System.out.println("Точки не принадлежат одной прямой");
		}

	}

}
