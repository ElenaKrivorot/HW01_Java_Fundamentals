package by.krivorot.hw01.linear;

public class Task37_8 {

	public static void main(String[] args) {
		/*
		 * ��������� �������� ���������, ���������� �������� true, ���� ���������
		 * ������������ �������� ��������, � false � � ��������� ������: �������� �����
		 * N �������� �������� ����� � (���������� ������� ����� ���������� � ���������
		 * �� 0 �� 4).
		 */
		
		int N = 125;
		int a = 5;

		System.out.println((Math.pow(a, 0) == N)||(Math.pow(a, 1) == N)||(Math.pow(a, 2) == N)||(Math.pow(a, 3) == N)||(Math.pow(a, 4) == N));
	}

}
