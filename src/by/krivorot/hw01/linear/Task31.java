package by.krivorot.hw01.linear;

public class Task31 {

	public static void main(String[] args) {
		/*
		 * Составить программу для вычисления пути, пройденного лодкой, если ее скорость
		 * в стоячей воде v км/ч, скорость течения реки v1 км/ч, время движения по озеру
		 * t1 ч, а против течения реки — t2 ч.
		 * 
		 */

		double v = 7;
		double v1 = 4;
		double t1 = 5;
		double t2 = 6;
		double S;

		S = v * t1 + (v - v1) * t2;

		System.out.println("Путь равен " + S);

	}

}
