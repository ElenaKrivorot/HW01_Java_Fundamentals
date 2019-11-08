package by.krivorot.hw1.cycles;

public class Task16 {

	public static void main(String[] args) {
		// Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).

		double i;
		double s = 1;
		double s1 = 1;

		for (i = 2; i <= 10; i = i + 1) {
			s1 = s1 + i;
			s = s * s1;
		}

		System.out.println(s);
	}

}
