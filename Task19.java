package by.krivorot.hw01.linear;

public class Task19 {

	public static void main(String[] args) {
		/*
		 * ���� ������� ��������������� ������������. ����� ������� ����� ������������,
		 * ��� ������, ������� ��������� � ��������� �����������.
		 */

		double a = 4;
		double S;
		double h;
		double r;
		double R;

		h = Math.cbrt(3) * a / 2;
		S = 0.5 * a * h;
		r = a / (2 * Math.cbrt(3));
		R = a / Math.cbrt(3);

		System.out.println("������� ������������ " + S);
		System.out.println("������ ������������ " + h);
		System.out.println("������ ��������� ���������� " + r);
		System.out.println("������ ��������� ���������� " + R);

	}

}
