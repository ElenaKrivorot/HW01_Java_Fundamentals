package by.krivorot.hw01.conditional;

public class Task15 {

	public static void main(String[] args) {
		/*
		 * Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух
		 * чисел заменить половиной их суммы, а большее — их удвоенным произведением.
		 */

		double a = 30;
		double b = 60;
		double y1;
		double y2;

		y1 = (a + b) / 2;
		y2 = 2 * a * b;

		if (a < b) {
			a = y1;
			b = y2;
		} else {
			a = y2;
			b = y1;
		}

		System.out.println(+a);
		System.out.print(+b);

	}

}
