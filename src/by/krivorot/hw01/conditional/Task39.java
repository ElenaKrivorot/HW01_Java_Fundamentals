package by.krivorot.hw01.conditional;

public class Task39 {

	public static void main(String[] args) {
		// Вычислить значение функции: F(x)=-x^2+x-9 при x>=8; F(x)=1/(x^4-6) при x<8.

		double x = 1;
		double F;

		if (x >= 8) {
			F = x * x + x - 9;
		} else {
			F = 1 / (Math.pow(x, 4) - 6);
		}
		System.out.println("F(x) = " + F);

	}

}
