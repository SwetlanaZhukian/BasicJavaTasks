package by.jonlain.mod01.main;

/*Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
отверстие.
*/
public class Task10 {

	public static void main(String[] args) {

		double a;
		double b;

		double x;
		double y;
		double z;

		a = 900;
		b = 90;

		x = 250;
		y = 120;
		z = 80;

		if ((x <= a && y <= b) || (x <= b && y <= a)) {
			System.out.println("Кирпич пройдёт через отверстие.");

		} else if ((x <= a && z <= b) || (x <= b && z <= a)) {
			System.out.println("Кирпич пройдёт через отверстие.");

		} else if ((z <= a && y <= b) || (y <= a && z <= b)) {
			System.out.println("Кирпич пройдёт через отверстие.");

		} else {
			System.out.println("Кирпич  не пройдёт через отверстие.");
		}

	}

}
