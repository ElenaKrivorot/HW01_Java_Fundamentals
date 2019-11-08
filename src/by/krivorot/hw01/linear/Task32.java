package by.krivorot.hw01.linear;

public class Task32 {

	public static void main(String[] args) {
		/*
		 * Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0
		 * ≤к ≤59). Какое время будут показывать часы через р ч q мин r с?
		 */

		int m = 5;
		int n = 25;
		int k = 37;
		int m1;
		int n1;
		int k1;
		int p = 46;
		int q = 45;
		int r = 23;

		k1 = (k + r) % 60;
		n1 = (n + q + (k + r) / 60) % 60;
		m1 = (m + p + ((n + q + (k + r) / 60) / 60)) % 24;

		System.out.print("Время на часах " + m1);
		System.out.print(" часов " + n1);
		System.out.print(" минут " + k1);
		System.out.print(" секунд ");

	}

}
