package by.krivorot.hw1.cycles;

public class Task17 {

	public static void main(String[] args) {
		// Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)

		int i;
		int n = 10;
		double a = 3;
		double s = 1;

		for (i = 0; i <= (n - 1); i = i + 1) {
			s = s * (a + i);
		}

		System.out.println(s);

	}

}
