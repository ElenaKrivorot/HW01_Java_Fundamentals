package by.krivorot.hw01.linear;

public class Task12 {

	public static void main(String[] args) {
		/*
		 * ¬ычислить рассто€ние между двум€ точками с данными координатами (х1, у1)и
		 * (x2, у2).
		 */

		double x1 = 0;
		double y1 = 2;
		double x2 = 4;
		double y2 = 5;
		double s;

		s = Math.pow((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)), 0.5);

		System.out.println("–ассто€ние между двум€ токами " + s);

	}

}
