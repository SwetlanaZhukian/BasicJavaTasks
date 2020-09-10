package by.jonlain.mod01.main;

//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class Task19 {

	public static int getCountsOfDigits(int number) {
		int count;	
		count = (number == 0) ? 1 : 0;
		
		while (number != 0) {
			count++;
			number /= 10;
		}
		return count;
	}

	public static int[] createMas(int a, int count) {
		int number;
		int[] mas = new int[count];
		for (int i = 0; i < count; i++) {
			number = a % 10;
			a = a / 10;
			mas[i] = number;
		}
		return mas;
	}

	public static void main(String[] args) {

		int a;
		int b;

		a = 1677;
		b = 12567;

		int count1 = getCountsOfDigits(a);
		int count2 = getCountsOfDigits(b);

		int[] mas1 = createMas(a, count1);
		int[] mas2 = createMas(b, count2);

		for (int i = 0; i < mas1.length; i++) {
			int count = 0;

			for (int k = i + 1; k < mas1.length; k++) {
				if (mas1[i] == mas1[k]) {
					count++;
				}
			}

			if (count > 0) {
				continue;
			}

			for (int j = 0; j < mas2.length; j++) {
				if (mas1[i] == mas2[j]) {
					System.out.println(mas1[i]);
					break;

				}

			}

		}

	}

}
