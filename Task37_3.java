package by.krivorot.hw01.linear;

public class Task37_3 {

	public static void main(String[] args) {
		/*
		 * ��������� �������� ���������, ���������� �������� true, ���� ���������
		 * ������������ �������� ��������, � false � � ��������� ������: ����� ����
		 * ������� ������������ ����� N �������� ������ ������
		 */

		int N = 536;
		int a;
		int b;
		int c;
		double d;

		a = N % 10;
		N = N / 10;
		b = N % 10;
		c = N / 10;
		d = (a + b + c) % 2.0;

		System.out.println(d == 0);

	}

}
