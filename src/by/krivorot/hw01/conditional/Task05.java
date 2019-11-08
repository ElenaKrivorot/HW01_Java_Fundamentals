package by.krivorot.hw01.conditional;

public class Task05 {

	public static void main(String[] args) {
		// Составить программу: определения наименьшего из двух чисел а и b
		
		double a = 3;
		double b = 0;
		
		if (a < b) {
			System.out.println("Наименьшее число " + a);
		} else if (a > b) {
			System.out.println("Наименьшее число " + b);
		} else {
			System.out.println("Числа равны");
		}

	}

}
