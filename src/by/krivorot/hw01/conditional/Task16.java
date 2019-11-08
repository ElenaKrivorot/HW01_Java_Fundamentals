package by.krivorot.hw01.conditional;

public class Task16 {

	public static void main(String[] args) {
		/*
		 * На плоскости ХОY задана своими координатами точка А. Указать, где она
		 * расположена (на какой оси или в каком координатном угле).
		 * 
		 */

		double x = -6;
		double y = 4;

		if ((x == 0) && (y == 0)) {
			System.out.println("точка в начале координат");
		} else {
			if (x == 0) {
				System.out.println("точка принадлежит оси OY");
			} else if (y == 0) {
				System.out.println("точка принадлежит оси OX");
			} else {
				if (x > 0) {
					if (y > 0) {
						System.out.println("точка в первой четверти");
					} else {
						System.out.println("точка в четвертой четверти");
					}
				} else {
					if (y > 0) {
						System.out.println("точка во второй четверти");
					} else {
						System.out.println("точка в третьей четверти");
					}
				}
			}
		}
	}

}
