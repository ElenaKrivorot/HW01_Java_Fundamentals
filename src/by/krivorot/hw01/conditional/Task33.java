package by.krivorot.hw01.conditional;

public class Task33 {

	public static void main(String[] args) {
		/*
		 * Написать программу, которая по паролю будет определять уровень доступа
		 * сотрудника к секретной информации в базе данных. Доступ к базе имеют только
		 * шесть человек, разбитых на три группы по степени доступа. Они имеют следующие
		 * пароли: 9583, 1747 — доступны модули баз А, В, С; 3331, 7922 — доступны
		 * модули баз В, С; 9455, 8997 — доступен модуль базы С.
		 */

		int p = 9455;
		int i = 0;

		if ((p == 9583) || (p == 9583)) {
			i = 1;
			System.out.println("Уровень доступа " + i + ", доступны модули баз А, В, С");
		}
		if ((p == 3331) || (p == 7922)) {
			i = 2;
			System.out.println("Уровень доступа " + i + ", доступны модули баз В, C");
		}
		if ((p == 9455) || (p == 8997)) {
			i = 3;
			System.out.println("Уровень доступа " + i + ", доступен модуль базы C");
		}
		if (i == 0) {
			System.out.println("В доступе отказано");
		}

	}

}
