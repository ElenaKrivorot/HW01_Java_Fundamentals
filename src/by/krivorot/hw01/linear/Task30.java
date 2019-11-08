package by.krivorot.hw01.linear;

public class Task30 {

	public static void main(String[] args) {
		/*
		 * Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление
		 * соединения.
		 */

		double R1 = 3;
		double R2 = 4;
		double R3 = 5;
		double R;

		R = (R1 * R2 * R3) / (R1 * R2 + R1 * R3 + R2 * R3);

		System.out.println("Сопротивление соединения " + R);

	}

}
