package by.krivorot.hw01.linear;

public class Task34 {

	public static void main(String[] args) {
		/*
		 * Дана величина А, выражающая объем информации в байтах. Перевести А в более
		 * крупные единицы измерения информации
		 */

		long A = 540473547764L;
		double Kb;
		double Mb;
		double Gb;

		Kb = A / 1024.0;
		Mb = Kb / 1024;
		Gb = Mb / 1024;

		System.out.println("Число А в КБ " + Kb);
		System.out.println("Число А в МБ " + Mb);
		System.out.println("Число А в ГБ " + Gb);

	}

}
