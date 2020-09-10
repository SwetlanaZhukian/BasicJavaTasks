package by.jonlain.mod01.main;

//import java.math.BigInteger;

//Составить программу нахождения произведения квадратов первых двухсот чисел.
public class Task15 {

	public static void main(String[] args) {

		/*
		 * BigInteger result = BigInteger.valueOf(1);
		 * 
		 * for (int i = 1; i <= 200; i++) { BigInteger temp = BigInteger.valueOf(i * i);
		 * result = result.multiply(temp); }
		 */

		long result;
		long temp;

		result = 1;
		temp = 1;

		for (long i = 1; i <= 200; i++) {

			result = result * (i * i);

			if (temp > result) {
				break;
			}
			
			temp = result;

		}

		System.out.println("Произведение квадратов чисел, входящее в диапазон long = " + temp);

	}

}
