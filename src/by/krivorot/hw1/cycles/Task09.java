package by.krivorot.hw1.cycles;

public class Task09 {

	public static void main(String[] args) {
		// Найти сумму квадратов первых ста чисел.

		int i;
		int s = 0;

		for (i = 1; i <= 100; i = i + 1) {
			s = s + i * i;
		}
		System.out.println(s);

	}

}
