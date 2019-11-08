package by.krivorot.hw01.linear;

public class Task23 {

	public static void main(String[] args) {
		// Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R>
		// r).

		double R = 5;
		double r = 3;
		double S;

		S = Math.PI * R * R - Math.PI * r * r;

		System.out.println("Площадь кольца равна " + S);

	}

}
