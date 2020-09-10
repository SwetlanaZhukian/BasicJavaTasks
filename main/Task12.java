package by.jonlain.mod01.main;

import java.util.Scanner;

/*Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
все числа от 1 до введенного пользователем числа.
*/

public class Task12 {

	public static void main(String[] args) {

		int number;
		int sum = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Введите любое число от 1 до 1000 >> ");

			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.print("Введите любое число от 1 до 1000 >> ");
			}

			number = sc.nextInt();

		} while (number <= 0 || number > 1000);

		for (int i = 1; i <= number; i++) {
			sum = sum + i;
		}

		System.out.println("Сумма чисел от 1 до " + number + " = " + sum);

	}

}
