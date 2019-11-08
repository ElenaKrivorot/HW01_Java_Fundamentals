package by.krivorot.hw01.linear;

public class Task21 {

	public static void main(String[] args) {
		/*
		 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и
		 * целой частях). Поменять местами дробную и целую части числа и вывести
		 * полученное значение числа.
		 */

		double R = 123.456;
		int n;
		double n1;
		double d1;

		n = (int) R;
		d1 = n / 1000.0;
		R = R * 1000;
		n1 = R % 1000;
		R = n1 + d1;

		System.out.println("Полученное число " + R);
	}

}
