package by.jonlain.mod01.main;

//Вывести на экран соответствия между символами и их численными обозначениями в памяти компьютера
public class Task17 {

	public static void main(String[] args) {

		char ch;

		System.out.println("Основная латиница");

		for (int i = 32; i <= 127; i++) {
			ch = (char) i;
			System.out.print("Номер символа: " + i + "\t");
			System.out.println("Символ: " + ch);
		}

		/*
		 * System.out.println("Кириллица");
		 * 
		 * for (int i = 1024; i <= 1279; i++) { ch = (char) i;
		 * System.out.print("Номер символа: " + i + "\t"); System.out.println("Символ: "
		 * + ch); }
		 */

	}

}
