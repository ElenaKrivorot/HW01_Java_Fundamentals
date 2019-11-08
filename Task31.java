package by.krivorot.hw01.linear;

public class Task31 {

	public static void main(String[] args) {
		/*
		 * —оставить программу дл€ вычислени€ пути, пройденного лодкой, если ее скорость
		 * в сто€чей воде v км/ч, скорость течени€ реки v1 км/ч, врем€ движени€ по озеру
		 * t1 ч, а против течени€ реки Ч t2 ч.
		 */

		double v = 7;
		double v1 = 4;
		double t1 = 5;
		double t2 = 6;
		double S;

		S = v * t1 + (v - v1) * t2;
		
		System.out.println("ѕуть равен " + S);

	}

}
