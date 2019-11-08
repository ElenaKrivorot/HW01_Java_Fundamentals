package by.krivorot.hw01.linear;

public class Task19 {

	public static void main(String[] args) {
		/*
		 * Дана сторона равностороннего треугольника. Найти площадь этого треугольника,
		 * его высоту, радиусы вписанной и описанной окружностей.
		 */

		double a = 4;
		double S;
		double h;
		double r;
		double R;

		h = Math.cbrt(3) * a / 2;
		S = 0.5 * a * h;
		r = a / (2 * Math.cbrt(3));
		R = a / Math.cbrt(3);

		System.out.println("Площадь " + S);
		System.out.println("Высота " + h);
		System.out.println("Радиус вписанной окружности " + r);
		System.out.println("Радиус описанной окружности " + R);

	}

}
