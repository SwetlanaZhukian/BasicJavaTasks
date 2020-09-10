package by.jonlain.mod01.main;

//Вычислить значения функции на отрезке [а,b] c шагом h
public class Task13 {

	public static void main(String[] args) {

		double a;
		double b;
		double h;

		double y;

		a = 1;
		b = 10;
		h = 0.5;

		while (a <= b) {

			if (a > 2) {
				y = a;
			} else {
				y = -a;
			}

			System.out.print("Аргумент " + a + "\t");
			System.out.println("Значение функции = " + y);

			a += h;

		}

	}

}
