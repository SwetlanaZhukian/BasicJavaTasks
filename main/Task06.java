package by.jonlain.mod01.main;

/* Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае
*/
public class Task06 {

	public static void main(String[] args) {

		double x;
		double y;

		boolean z;

		x = -2.6;
		y = 2;

		if (((x <= 2 && x >= -2) && (y <= 4 && y >= 0)) || (((x <= 4 && x >= -4) && (y <= 0 && y >= -3)))) {
			z = true;
		}

		else {
			z = false;
		}

		System.out.println(z);

	}

}
