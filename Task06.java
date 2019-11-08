package by.krivorot.hw01.linear;

public class Task06 {

	public static void main(String[] args) {
		/*
		 * Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько
		 * литров молока в m больших бидонах, если в каждом большом бидоне на 12 л.
		 * больше, чем в малом?
		 */

		int n = 8;
		int m = 3;

		System.out.print("в " + m);
		System.out.print(" больших бидонах находится " + ((80 / n + 12) * m));
		System.out.print(" литров молока");
	}

}
