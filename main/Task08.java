package by.jonlain.mod01.main;

//Найти max{min(a, b), min(c, d)}
public class Task08 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int d;

		int max;
		int min1;
		int min2;

		a = 78;
		b = 90;
		c = -90;
		d = 898;

		if (a < b) {
			min1 = a;
		} else {
			min1 = b;
		}

		if (c < d) {
			min2 = c;
		} else {
			min2 = d;
		}

		if (min1 > min2) {
			max = min1;
		} else {
			max = min2;
		}

		System.out.printf("%d максимальное число из %d и %d ", max, min1, min2);
	}

}
