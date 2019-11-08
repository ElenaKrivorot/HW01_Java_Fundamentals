package by.krivorot.hw01.conditional;

import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		/*
		 * Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или
		 * девочка? Введи Д или М». В зависимости от ответа на экране должен появиться
		 * текст «Мне нравятся девочки!» или «Мне нравятся мальчики!».
		 */

		char ch;

		System.out.println("Кто ты: мальчик или девочка? Введи Д или М");

		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);

		if (ch == 'Д') {
			System.out.println("Мне нравятся девочки!");
		} else if (ch == 'М') {
			System.out.println("Мне нравятся мальчики!");
		} else {
			System.out.println("Ошибка!");
		}
		sc.close();
	}

}
