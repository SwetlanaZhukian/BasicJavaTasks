package by.jonlain.mod01.main;

//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой. 
public class Task09 {

	public static void main(String[] args) {

		double x1;
		double y1;

		double x2;
		double y2;

		double x3;
		double y3;

		x1 = -2;
		y1 = 5;

		x2 = 4;
		y2 = 3;

		x3 = 16;
		y3 = -1;

		if (((y3 - y1) * (x2 - x1)) == ((x3 - x1) * (y2 - y1))) {
			System.out.println("Точки расположены на одной прямой");

		} else {
			System.out.println("Точки не расположены на одной прямой");

		}
	}

}
