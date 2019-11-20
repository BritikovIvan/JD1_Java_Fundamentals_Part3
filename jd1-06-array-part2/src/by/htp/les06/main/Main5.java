package by.htp.les06.main;

public class Main5 {

	/*
	 * Сортировка вставками. Дана последовательность чисел. Требуется переставить
	 * числа в порядке возрастания. Делается это следующим образом. Пусть a1,
	 * a2,..., ai - упорядоченная последовательность, т. е. a1 <= a2 <= ... <= an.
	 * Берется следующее число a(i + 1) и вставляется в последовательность так,
	 * чтобы новая последовательность была тоже возрастающей. Процесс производится
	 * до тех пор, пока все элементы от i + 1 до n не будут перебраны. Примечание.
	 * Место помещения очередного элемента в отсортированную часть производить с
	 * помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
	 */

	public static void main(String[] args) {
		int[] ar = { 1, 4, 7, 9, 10, 23, 54, 3, 34, 72, 11 };

		sort(ar);
		print(ar);
	}

	public static void print(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Ar[" + i + "] = " + ar[i]);
		}
	}

	public static void sort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int ind = fun(array, i);
			for (int j = i; j > ind; j--) {
				int perm = array[j];
				array[j] = array[j - 1];
				array[j - 1] = perm;
			}
		}
	}

	public static int fun(int[] array, int len) {
		int i = -1;
		int s = len;

		while (s - 1 > i) {
			int m = (i + s) / 2;

			if (array[m] < array[len]) {
				i = m;
			} else {
				s = m;
			}
		}

		return s;
	}

}
