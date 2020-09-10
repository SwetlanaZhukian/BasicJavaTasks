package by.jonlain.mod01.main;

/*Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
он прямоугольным.
*/
public class Task07 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;

		a = 90;
		b = 78;
		c = 180 - a - b;

		if (c <= 0) {
			System.out.println("Треугольник с углами " + a + ", " + b + ", " + c + "  не существует!");
		} else {
			System.out.println("Треугольник с углами " + a + ", " + b + ", " + c + " существует!");

			if (a == 90 || b == 90 || c == 90) {
				System.out.println("Треугольник прямоугольный!");
			}
		}

	}

}
