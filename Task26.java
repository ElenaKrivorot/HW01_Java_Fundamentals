package by.krivorot.hw01.linear;

public class Task26 {

	public static void main(String[] args) {
		/*
		 * Найти площадь треугольника, две стороны которого равны а и b, а угол между
		 * этими сторонами у.
		 */

		double a = 5;
		double b = 4;
		double y = 30;
		double S;

		y = Math.toRadians(y);
		S = 0.5 * a * b * Math.sin(y);

		System.out.println("Площадь треугольника равна " + S);

	}

}
