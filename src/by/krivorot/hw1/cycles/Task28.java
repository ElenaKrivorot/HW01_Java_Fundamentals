package by.krivorot.hw1.cycles;

import java.util.Scanner;

public class Task28 {

	public static void main(String[] args) {
		/*
		 * �������� ���������, � ������� �������� ��� �������� � � Y � ���� �������� (+,
		 * �, /, *). ��������� ��������� Z � ����������� �� �����. ������������� �������
		 * �� ��������� �������� ���� ��������, � ����� �� ���� Y=0 ��� �������.
		 * ������������ ����������� ������������ ���������� ��� ������������ ���������
		 * (�.�. ��������� ����). � �������� ������� ����������� ���������� ������� �0�.
		 */

		double x;
		double y = 0;
		char ch = 0;
		char ch1;
		int j = 0;
		int k = 0;
		int q = 0;
		double z = 0;

		Scanner sc = new Scanner(System.in);

		while (j == 0) {
			System.out.println("������� ������ ����� X");

			while (!sc.hasNextDouble()) {
				sc.next();
				System.out.println("������� ������������ �����. ������� ����� ���� double");
			}

			x = sc.nextDouble();

			while (k == 0) {
				System.out.println("������� ������ ����� Y");
				while (!sc.hasNextDouble()) {
					sc.next();
					System.out.println("������� ������������ �����. ������� ����� ���� double");
				}
				y = sc.nextDouble();

				while (q == 0) {
					System.out.println("������� ���� �������� +, -, /, *");
					ch = sc.next().charAt(0);
					if ((ch != '/') && (ch != '*') && (ch != '-') && (ch != '+')) {
						System.out.println("������ ������������ ��������. ��������� ���� ���������");
					} else {
						q = 1;
					}
				}

				if ((ch == '/') && (y == 0)) {
					System.out.println("�� ���� ������ ������. ��������� �������� Y � ���������");
					q = 0;
				} else {
					k = 1;
				}

			}

			k = 0;
			q = 0;

			if (ch == '/') {
				z = x / y;
			}
			if (ch == '*') {
				z = x * y;
			}
			if (ch == '-') {
				z = x - y;
			}
			if (ch == '+') {
				z = x + y;
			}

			System.out.println("�����: " + z);
			System.out.println("����� ���������� ���������� ������� '0', ����� ���������� - ������� ����� ������");
			ch1 = sc.next().charAt(0);
			if (ch1 == '0') {
				j = 1;
			}

		}
		sc.close();
	}

}
