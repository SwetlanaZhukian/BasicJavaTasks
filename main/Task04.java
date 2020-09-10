package by.jonlain.mod01.main;
/*
  Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и
  целой частях). Поменять местами дробную и целую части числа и вывести
  полученное значение числа.
 */

public class Task04 {

	public static void main(String[] args) {

		double r;

		int x;
		double y;

		double z;

		r = 983.356;

		// выделяем целую часть
		x = (int) r;

		// выделяем дробную часть
		y = (r * 1000.0) % 1000.0;

		z = y + (x / 1000.0);

		System.out.println("Исходное число: " + r);
		System.out.println("Новое число:    " + z);
	}

}
