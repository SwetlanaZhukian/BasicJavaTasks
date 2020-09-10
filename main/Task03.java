package by.jonlain.mod01.main;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения)
public class Task03 {

	public static void main(String[] args) {

		double x;
		double y;

		double z;

		x = 0.5;
		y = 2.5;

		z = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);

		System.out.println("z = " + z);

	}

}
