package by.krivorot.hw01.linear;

public class Task38_3 {

	public static void main(String[] args) {
		/*
		 * ��� ������ �������� ��������� �������� ���������, ������� �������� true, ����
		 * ����� � ������������ (�, �) ����������� ����������� �������, � false � �
		 * ��������� ������: ������� c.
		 */

		double x = 2;
		double y = -3;

		System.out.println(((y >= -5) && (y <= 0) && (x <= 5) && (x >= 0)) && ((x * x + y * y) <= 25)
				|| ((y >= 0) && (y <= 4) && (x <= 4) && (x >= 0) && ((x * x + y * y) <= 16)));
	}

}
