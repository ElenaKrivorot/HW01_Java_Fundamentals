package by.krivorot.hw01.linear;

public class Task09 {

	public static void main(String[] args) {
		/*
		 * Вычислить значение выражения по формуле (все переменные принимают
		 * действительные значения): (a / c) * (b / d) - (a * b - c) / (c * d)
		 */
		
		double a = 4;
		double b = 6;
		double c = 2;
		double d = 3;
		double y;

		y = (a/c)*(b/d)-(a*b-c)/(c*d);
		
		System.out.println("значение выражения равняется " + y);
	}

}
