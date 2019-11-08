package by.krivorot.hw01.conditional;

public class Task38 {

	public static void main(String[] args) {
		// Вычислить значение функции: F(x)=x^2 при 0<=x<=3; F(x)=4 при x>3 или x<0.

		double x = 1;
		double F;

		if ((x <= 3) && (x >= 0)) {
			F = x * x;
		} else {
			F = 4;
		}
		System.out.println("F(x) = " + F);
	}

}
