package by.krivorot.hw01.linear;

public class Task40 {

	public static void main(String[] args) {
		/*
		 * ���� �������� �. �������� �������� -2� + 3�2 - 4�3 � 1 + 2� + 3�2 + 4�3 .
		 * ������������ �� �������� ��������.
		 */

		double x = 2;
		double x1;

		x1 = x * x;

		System.out.println(+((-2 + 3 * x - 4 * x1) * x));
		System.out.println(+(1 + (2 + 3 * x + 4 * x1) * x));

	}

}
