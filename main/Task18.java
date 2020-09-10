package by.jonlain.mod01.main;

import java.util.Scanner;

/* Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры.*/
public class Task18 {

	public static void main(String[] args) {

		int m;
		int n;
		int count;

		int divisor;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Введите число m >> ");

			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.print("Введите число m  >> ");
			}

			m = sc.nextInt();

		} while (m <= 0);

		do {
			System.out.print("Введите число n >> ");

			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.print("Введите число n >> ");
			}

			n = sc.nextInt();

		} while (n <= 0 || n < m);

		for (int i = m; i <= n; i++) {

			System.out.println("Число: " + i + "\t");
			count = 0;

			for (int j = 2; j <= n; j++) {

				if (i % j == 0 && i != j) {
					divisor = j;
					count++;
					System.out.println("Делители: " + divisor);
				}
			}

			if (count == 0) {
				System.out.println("Делителей нет");
			}

			System.out.println();
		}

	}

}
