package by.krivorot.hw1.cycles;

public class Task05 {

	public static void main(String[] args) {
		/*
		 * С помощью оператора while напишите программу определения суммы всех нечетных
		 * чисел в диапазоне от 1 до 99 включительно.
		 */

		int a = 1;
		int s = 0;

		while (a <= 99) {
			s = s + a;
			a = a + 2;			
		}
		System.out.print("Сумма равна " + s);

	}

}
