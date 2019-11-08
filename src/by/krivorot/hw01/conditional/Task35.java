package by.krivorot.hw01.conditional;

public class Task35 {

	public static void main(String[] args) {
		// Вычислить число и месяц в невисокосном году по номеру дня.

		int d = 334;

		if ((d > 0) && (d < 32)) {
			System.out.println(d + " января");
		}
		if ((d > 31) && (d < 60)) {
			System.out.println((d - 31) + " февраля");
		}
		if ((d > 59) && (d < 91)) {
			System.out.println((d - 59) + " марта");
		}
		if ((d > 90) && (d < 121)) {
			System.out.println((d - 90) + " апреля");
		}
		if ((d > 120) && (d < 152)) {
			System.out.println((d - 120) + " мая");
		}
		if ((d > 151) && (d < 182)) {
			System.out.println((d - 151) + " июня");
		}
		if ((d > 181) && (d < 213)) {
			System.out.println((d - 181) + " июля");
		}
		if ((d > 212) && (d < 244)) {
			System.out.println((d - 212) + " августа");
		}
		if ((d > 243) && (d < 274)) {
			System.out.println((d - 243) + " сентября");
		}
		if ((d > 273) && (d < 305)) {
			System.out.println((d - 273) + " октября");
		}
		if ((d > 304) && (d < 335)) {
			System.out.println((d - 304) + " ноября");
		}
		if ((d > 334) && (d < 366)) {
			System.out.println((d - 334) + " декабря");
		}
		if ((d > 365) || (d < 1)) {
			System.out.println("Введен некорректный день");
		}

	}

}
