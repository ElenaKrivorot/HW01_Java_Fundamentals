package by.krivorot.hw01.linear;

public class Task33 {

	public static void main(String[] args) {
		/*
		 * Ввести любой символ и определить его порядковый номер, а также указать
		 * предыдущий и последующий символы.
		 */

		char ch = ';';
		int i;
		int ch1;
		int ch2;

		i = ch;
		ch1 = i - 1;
		ch2 = i + 1;

		System.out.println("Номер символа " + i);
		System.out.println("Предыдущий символ " + (char) ch1);
		System.out.println("Последующий символ " + (char) ch2);

	}

}
