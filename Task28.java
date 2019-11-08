package by.krivorot.hw01.linear;

public class Task28 {

	public static void main(String[] args) {
		// Составить программу перевода радианной меры угла в градусы, минуты и секунды.

		double x = 1.999;
		double y;
		double y1;
		double y2;
		double y3;
		double y4;
		double y5;
		double y6;
		double y7;

		y = Math.toDegrees(x);
		y1 = Math.floor(y); // градусы
		y2 = y - y1;
		y3 = y2 * 60;
		y4 = Math.floor(y3); // минуты
		y5 = y3 - y4;
		y6 = y5 * 60;
		y7 = Math.round(y6); // секунды

		System.out.print("угол равен " + y1);
		System.out.print(" градусов " + y4);
		System.out.print(" минут " + y7);
		System.out.print(" секунд");

	}

}
