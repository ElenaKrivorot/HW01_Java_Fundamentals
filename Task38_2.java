package by.krivorot.hw01.linear;

public class Task38_2 {

	public static void main(String[] args) {
		/*
		 * ��� ������ �������� ��������� �������� ���������, ������� �������� true, ����
		 * ����� � ������������ (�, �) ����������� ����������� �������, � false � �
		 * ��������� ������: ������� b.
		 */

		double x = 2;
		double y = -3;

		System.out.println(
				((y >= 0) && (y <= 4) && (x <= 2) && (x >= -2)) || ((y >= -3) && (y <= 0) && (x <= 4) && (x >= -4)));

	}

}
