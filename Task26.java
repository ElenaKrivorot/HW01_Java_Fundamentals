package by.krivorot.hw01.linear;

public class Task26 {

	public static void main(String[] args) {
		/*
		 * ����� ������� ������������, ��� ������� �������� ����� � � b, � ���� �����
		 * ����� ��������� �.
		 */

		double a = 5;
		double b = 4;
		double y = 30;
		double S;

		y = Math.toRadians(y);
		S = 0.5 * a * b * Math.sin(y);

		System.out.println("������� ������������ ����� " + S);

	}

}
