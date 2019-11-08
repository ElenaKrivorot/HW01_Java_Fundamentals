package by.krivorot.hw01.linear;

public class Task22 {

	public static void main(String[] args) {
		/*
		 * Дано натуральное число Т, которое представляет длительность прошедшего
		 * времени в секундах. Вывести данное значение длительности в часах, минутах и
		 * секундах в следующей форме: ННч ММмин SSc
		 */

		int T = 7622;
		int T1;
		int h;
		int m;
		int s;

		h = T / 3600;
		T1 = T - (h * 3600);
		m = T1 / 60;
		s = T1 % 60;

		System.out.print(+T);
		System.out.print(" секунд равняется ");
		System.out.print(+h);
		System.out.print("ч ");
		System.out.print(+m);
		System.out.print("мин ");
		System.out.print(+s);
		System.out.print("с");
	}

}
