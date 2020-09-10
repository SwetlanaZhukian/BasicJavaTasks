package by.jonlain.mod01.main;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения)
public class Task02 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;

		double z;

		a = 2.0;
		b = 0.5;
		c = 4.5;

		z = (b + Math.sqrt((b * b + 4 * a * c))) / (2 * a);
		z = z - Math.pow(a, 3) * c + Math.pow(b, -2);

		System.out.println("z = " + z);
	}

}
