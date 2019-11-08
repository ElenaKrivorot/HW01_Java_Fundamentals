package by.krivorot.hw01.conditional;

public class Task10 {

	public static void main(String[] args) {
		// Составить программу, которая определит площадь какого круга меньше.

		double r1 = 2;
		double r2 = 7;

		if (r1 < r2) {
			System.out.println("Площадь первого круга меньше");
		} else if (r1 > r2) {
			System.out.println("Площадь второго круга меньше");
		} else {
			System.out.println("Площади кругов равны");
		}

	}

}
