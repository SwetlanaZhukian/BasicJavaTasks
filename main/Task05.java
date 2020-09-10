package by.jonlain.mod01.main;

import java.util.Scanner;

/* Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
 Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
 */

public class Task05 {

	public static void main(String[] args) {

		int t;

		int hour;
		int minute;
		int second;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Введите количество секунд >> ");

			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.print("Введите количество секунд >> ");
			}

			t = sc.nextInt();

		} while (t <= 0);

		hour = t / 3600;

		if (t < 3600) {

			minute = t / 60;
			second = t % 60;

		} else {

			minute = (t % 3600) / 60;
			second = (t % 3600) % 60;
		}

		System.out.format("%02dч %02dмин %02dс", hour, minute, second);

	}

}
