package by.krivorot.hw1.cycles;

public class Task12 {

	public static void main(String[] args) {
		/*
		 * Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1
		 * Составьте программу нахождения произведения первых 10 членов этой
		 * последовательности.
		 */

		int i;
		double an = 1;
		double S = 1;

		for (i = 1; i <= 9; i = i + 1) {
			an = 6 + an;
			S = S * an;
		}
		
		System.out.println(S);
	}

}
