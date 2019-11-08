package by.krivorot.hw01.linear;

public class Task38_1 {

	public static void main(String[] args) {
		/*
		 * Для данных областей составить линейную программу, которая печатает true, если
		 * точка с координатами (х, у) принадлежит закрашенной области, и false — в
		 * противном случае: вариант а.
		 */

		double x = 2;
		double y = 2;

		System.out.println((y <= (4 + x)) && (y <= (4 - x)) && (x <= 4) && (x >= -4));

	}

}
