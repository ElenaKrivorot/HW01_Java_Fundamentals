package by.krivorot.hw01.linear;

public class Task13 {

	public static void main(String[] args) {
		/*
		 * ������ ���������� ���� ������ ������������ (�1 �2),(�2, �2) ),(�3, �3). �����
		 * ��� �������� � �������.
		 */

		double x1 = 1;
		double y1 = 1;
		double x2 = 2;
		double y2 = 4;
		double x3 = 3;
		double y3 = 2;
		double a;
		double b;
		double c;
		double S;
		double P;

		a = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		b = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
		c = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));

		P = a + b + c;
		S = Math.sqrt(P / 2 * (P / 2 - a) * (P / 2 - b) * (P / 2 - c));

		System.out.println("�������� ����� " + P);
		System.out.println("������� ����� " + S);

	}

}
