package by.krivorot.hw01.linear;

public class Task10 {

	public static void main(String[] args) {
		/*
		 * ��������� �������� ��������� �� ������� (��� ���������� ���������
		 * �������������� ��������): (sin(x)+cos(y))/(cos(x)-sin(y))*tg(x*y)
		 */

		double x = 4;
		double y = 2;
		double z;

		z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan((x * y));
		
		System.out.println("�������� ��������� ��������� " + z);

	}

}
