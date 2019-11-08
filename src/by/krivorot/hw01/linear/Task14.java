package by.krivorot.hw01.linear;

public class Task14 {

	public static void main(String[] args) {
		/*
		 * Вычислить длину окружности и площадь круга одного и того же заданного радиуса
		 * R.
		 */

		double R = 2;
		double C;
		double S;

		C = 2 * Math.PI * R;
		S = Math.PI * R * R;

		System.out.println("Длина окружности " + C);
		System.out.println("Площадь " + S);

	}

}
