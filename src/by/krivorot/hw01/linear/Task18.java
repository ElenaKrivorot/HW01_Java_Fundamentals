package by.krivorot.hw01.linear;

public class Task18 {

	public static void main(String[] args) {
		/*
		 * Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и
		 * объем этого куба.
		 */

		double r = 2;
		double s;
		double S;
		double V;

		s = r * r;
		S = s * 6;
		V = r * r * r;

		System.out.println("Площадь грани " + s);
		System.out.println("Площадь полной поверхности " + S);
		System.out.println("Объем куба " + V);

	}

}
