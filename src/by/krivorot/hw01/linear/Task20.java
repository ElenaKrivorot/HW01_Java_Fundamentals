package by.krivorot.hw01.linear;

public class Task20 {

	public static void main(String[] args) {
		/*
		 * Известна длина окружности. Найти площадь круга, ограниченного этой
		 * окружностью.
		 */

		double C = 4;
		double S;
		double r;

		r = C / 2 / Math.PI;
		S = Math.PI * r * r;

		System.out.println("Площадь " + S);

	}

}
