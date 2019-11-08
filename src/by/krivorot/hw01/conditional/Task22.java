package by.krivorot.hw01.conditional;

public class Task22 {

	public static void main(String[] args) {
		/*
		 * Перераспределить значения переменных х и у так, чтобы в х оказалось большее
		 * из этих значений, а в y - меньшее.
		 */

		double x = 10;
		double y = 12;
		double t;

		if (y > x) {
			t = x;
			x = y;
			y = t;
		}
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
