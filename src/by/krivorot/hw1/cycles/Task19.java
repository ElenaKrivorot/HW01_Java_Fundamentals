package by.krivorot.hw1.cycles;

public class Task19 {

	public static void main(String[] args) {
		/*
		 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль
		 * которых больше или равен заданному е. Общий член ряда имеет вид: 1/2^n+1/3^n
		 */

		int i = 1;
		double e = 0.111;
		double an;
		double s = 0;

		an = 1 / Math.pow(2, 1) + 1 / Math.pow(3, 1);

		while (Math.abs(an) >= e) {
			s = s + an;
			i = i + 1;
			an = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);

		}

		System.out.println(s);
	}

}
