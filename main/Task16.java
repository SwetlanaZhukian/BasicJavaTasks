package by.jonlain.mod01.main;

/*Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
заданному е.
*/
public class Task16 {

	public static void main(String[] args) {

		int n;
		double e;
		double a;
		double sum;

		n = 8;
		e = 0.3;
		sum = 0;

		for (int i = 1; i <= n; i++) {
			a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);

			if (Math.abs(a) >= e) {
				sum = sum + a;
			}
		}

		System.out.println(sum);

	}

}
