package by.krivorot.hw01.linear;

public class Task21 {

	public static void main(String[] args) {
		/*
		 * ���� �������������� ����� R ���� nnn.ddd (��� �������� ������� � ������� �
		 * ����� ������). �������� ������� ������� � ����� ����� ����� � �������
		 * ���������� �������� �����.
		 */

		double R = 123.456;
		int n;
		double n1;
		double d1;

		n = (int) R;
		d1 = n / 1000.0;
		R = R * 1000;
		n1 = R % 1000;
		R = n1 + d1;

		System.out.println("���������� ����� ����� " + R);
	}

}
