package by.krivorot.hw01.linear;

public class Task37_2 {

	public static void main(String[] args) {
		/*
		 * ��������� �������� ���������, ���������� �������� true, ���� ���������
		 * ������������ �������� ��������, � false � � ��������� ������: ����� ����
		 * ������ ���� ��������� ��������������� ����� ����� ����� ���� ��� ���������
		 * ����.
		 */

		int N = 4536;
		int a;
		int b;
		int c;
		int d;
		
		a = N % 10;
		N = N / 10;
		b = N % 10;
		N = N / 10;
		c = N % 10;
		d = N / 10;
					
		System.out.println((a + b) == (c + d));

	}

}
