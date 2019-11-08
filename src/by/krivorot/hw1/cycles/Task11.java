package by.krivorot.hw1.cycles;

public class Task11 {

	public static void main(String[] args) {
		// Составить программу нахождения разности кубов первых двухсот чисел

		int i;
		int s = 0;

		for (i = 1; i <= 200; i = i + 1) {
			s = s - i * i * i;
		}
		System.out.println(s);

	}

}
