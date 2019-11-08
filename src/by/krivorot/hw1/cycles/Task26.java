package by.krivorot.hw1.cycles;

public class Task26 {

	public static void main(String[] args) {
		/*
		 * Вывести на экран соответствий между символами и их численными обозначениями в
		 * памяти компьютера (Таблицу ASCII).
		 */

		int i;

		for (i = 0; i <= 127; i = i + 1) {
			System.out.println((char) i + " -> " + Integer.toHexString(i));
		}

	}

}
