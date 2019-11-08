package by.krivorot.hw1.cycles;

public class Task20 {

	public static void main(String[] args) {
		/*
		 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль
		 * которых больше или равен заданному е. Общий член ряда имеет вид: an =
		 * 1/((3*n-2)*(3*n+1))
		 */

		int i = 1;
		double e = 0.111;
		double an;
		double s = 0;

		an = 1.0 / ((3 * 1 - 2) * (3 * 1 + 1));

		while (Math.abs(an) >= e) {
			s = s + an;
			i = i + 1;
			an = 1.0 / ((3 * i - 2) * (3 * i + 1));

		}

		System.out.println(s);

	}

}
