package by.krivorot.hw01.conditional;

public class Task11 {

	public static void main(String[] args) {
		/*
		 * Составить программу, которая определит площадь какого треугольника больше.
		 * (найдем площадь по трем сторонам)
		 */

		double a1 = 6;
		double b1 = 7;
		double c1 = 3;
		double a2 = 5;
		double b2 = 4;
		double c2 = 5;
		double p1;
		double p2;
		double S1;
		double S2;

		p1 = (a1 + b1 + c1) / 2;
		p2 = (a2 + b2 + c2) / 2;
		S1 = Math.sqrt(p1 * (p1 - a1) * (p1 - b1) * (p1 - c1));
		S2 = Math.sqrt(p2 * (p2 - a2) * (p2 - b2) * (p2 - c2));

		if (S1 < S2) {
			System.out.println("Площадь второго треугольника больше");
		} else if (S1 > S2) {
			System.out.println("Площадь первого треугольника больше");
		} else {
			System.out.println("Площади равны");
		}

	}

}
