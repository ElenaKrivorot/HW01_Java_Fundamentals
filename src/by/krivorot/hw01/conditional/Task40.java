package by.krivorot.hw01.conditional;

public class Task40 {

	public static void main(String[] args) {
		// Вычислить значение функции: F(x)=-x^3+9 при x<=13; F(x)=-3/(x+1) при x>13.

		double x = 1;
		double F;

		if (x <= 13) {
			F = -x * x * x + 9;
		} else {
			F = -3 / (x + 1);
		}
		System.out.println("F(x) = " + F);

	}

}
