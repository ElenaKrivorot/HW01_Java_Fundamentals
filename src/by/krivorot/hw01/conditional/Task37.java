package by.krivorot.hw01.conditional;

public class Task37 {

	public static void main(String[] args) {
		//  Вычислить значение функции: F(x)=-x^2+3x+9 при x>=3; F(x)=1/(x^3-6) при x<3.

		double x = 2;
		double F;

		if (x >= 3) {
			F = -x * x + 3 * x + 9;
		} else {
			F = 1 / (x * x * x - 6);
		}
		System.out.println("F(x) = " + F);

	}

}
