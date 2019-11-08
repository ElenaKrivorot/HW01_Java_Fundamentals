package by.krivorot.hw1.cycles;

public class Task18 {

	public static void main(String[] args) {
		/*
		 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль
		 * которых больше или равен заданному е. Общий член ряда имеет вид: an =
		 * ((-1)^(n-1))/n
		 */

		int i = 1;
		double e = 0.111;
		double an;
		double s = 0;

		an = Math.pow(-1, (1 - 1)) / 1;

		while (Math.abs(an) >= e) {
			s = s + an;
			i = i + 1;
			an = Math.pow(-1, (i - 1)) / i;

		}

		System.out.println(s);

	}

}
