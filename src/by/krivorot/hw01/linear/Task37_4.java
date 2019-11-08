package by.krivorot.hw01.linear;

public class Task37_4 {

	public static void main(String[] args) {
		/*
		 * Составить линейную программу, печатающую значение true, если указанное
		 * высказывание является истинным, и false — в противном случае: Точка с
		 * координатами (х, у) принадлежит части плоскости, лежащей между прямыми х = m,
		 * х = n,(m<n).
		 */

		double x = 6;
		double m = 5;
		double n = 9;

		System.out.println((x >= m) && (x <= n));

	}

}
