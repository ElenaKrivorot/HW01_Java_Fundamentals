package by.krivorot.hw01.linear;

public class Task11 {

	public static void main(String[] args) {
		/*
		 * ��������� �������� � ������� �������������� ������������ �� ������ � � b ����
		 * �������.
		 */

		double a = 3;
		double b = 4;
		double S;
		double P;

		S = 0.5 * a * b;
		P = a + b + (Math.pow(((a * a + b * b)), 0.5));

		System.out.println("�������� ����� " + P);
		System.out.println("������� ����� " + S);

	}

}
