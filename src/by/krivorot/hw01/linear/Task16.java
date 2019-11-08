package by.krivorot.hw01.linear;

public class Task16 {

	public static void main(String[] args) {
		// Найти произведение цифр заданного четырехзначного числа.

		int n = 9999;
		int x1;
		int x2;
		int x3;
		int x4;
		int z;

		x1 = n % 10;
		n = n / 10;
		x2 = n % 10;
		n = n / 10;
		x3 = n % 10;
		x4 = n / 10;
		z = x1 * x2 * x3 * x4;

		System.out.println("Произведение равно " + z);

	}

}
