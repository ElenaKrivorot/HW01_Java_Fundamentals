package by.krivorot.hw01.linear;

public class Task37_1 {

	public static void main(String[] args) {
		/*
		 * ��������� �������� ���������, ���������� �������� true, ���� ���������
		 * ������������ �������� ��������, � false � � ��������� ������: ����� ����� N
		 * �������� ������ ���������� ������
		 */

		int N = 122;
		int a;
		int b;
		double c;

		a = N / 10;
		b = N / 100;
		c = N % 2.0;

		System.out.println((a != 0) && (b == 0) && (c == 0));

	}

}
