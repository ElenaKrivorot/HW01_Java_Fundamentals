package by.krivorot.hw01.conditional;

public class Task14 {

	public static void main(String[] args) {
		/*
		 * Даны два угла треугольника (в градусах). Определить, существует ли такой
		 * треугольник, и если да, то будет ли он прямоугольным.
		 */

		double q1 = 30;
		double q2 = 60;

		if ((q1 + q2) < 180) {

			System.out.print("Такой треугольник существует, ");

			if ((q1 == 90) || (q2 == 90) || ((q1 + q2) == 90)) {

				System.out.println("он прямоугольный");

			} else {

				System.out.println("он не прямоугольный");

			}

		} else {

			System.out.println("Такого треугольника не существует");
		}

	}

}
