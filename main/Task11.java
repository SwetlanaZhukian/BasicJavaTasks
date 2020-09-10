package by.jonlain.mod01.main;

//Вычислить значение функции
public class Task11 {

	public static void main(String[] args) {

		double x;
		double f;

		x = 18;

		if (x <= 3) {
			f = x * x - 3 * x + 9;
			System.out.println(f);
		} else {
			f = 1 / (Math.pow(x, 3) + 6);
			System.out.println(f);
		}

	}

}
