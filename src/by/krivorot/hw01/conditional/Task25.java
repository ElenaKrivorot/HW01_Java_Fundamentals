package by.krivorot.hw01.conditional;

public class Task25 {

	public static void main(String[] args) {
		/*
		 * Написать программу — модель анализа пожарного датчика в помещении, которая
		 * выводит сообщение «Пожароопасная ситуация », если температура в комнате
		 * превысила 60° С.
		 */

		double t = 61;

		if (t > 60) {
			System.out.println("Пожароопасная ситуация ");
		}
	}

}
