package by.krivorot.hw01.linear;

public class Task29 {

	public static void main(String[] args) {
		// Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с.


		double a = 3;
		double b = 4;
		double c = 5;
		double y1;
		double y2;
		double x1;
		double x2;
		double z1;
		double z2;

		y1 = Math.acos((a * a + b * b - c * c) / (2 * a * b));
		y2 = Math.toDegrees(y1);
		x1 = Math.acos((a * a + c * c - b * b) / (2 * a * c));
		x2 = Math.toDegrees(x1);
		z1 = Math.acos((c * c + b * b - a * a) / (2 * c * b));
		z2 = Math.toDegrees(z1);

		System.out.print("угол 1 равен " + y1);
		System.out.print(" радиан " + y2);
		System.out.println(" градусов ");
		System.out.print("угол 2 равен " + x1);
		System.out.print(" радиан " + x2);
		System.out.println(" градусов ");
		System.out.print("угол 3 равен " + z1);
		System.out.print(" радиан " + z2);
		System.out.print(" градусов ");

	}

}
