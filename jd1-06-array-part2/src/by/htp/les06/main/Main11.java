package by.htp.les06.main;

public class Main11 {

	/*
	 * «Хитрая» сортировка. Из массива путем однократного просмотра выбирается
	 * последовательность элементов, расположенных в порядке возрастания,
	 * переносится в выходной массив и заменяется во входном на -1. Затем оставшиеся
	 * элементы включаются в полученную упорядоченную последовательность методом
	 * «погружения», когда очередной элемент путем ряда обменов «погружается» до
	 * требуемой позиции в уже упорядоченную часть массива.
	 */

	public static void main(String[] args) {
		int[] ar = { 1, 4, 7, 9, 10, 23, 54, 3, 34, 72, 11, 10, 9 };

		ar = sort(ar);
		print(ar);
	}

	public static void print(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Ar[" + i + "] = " + ar[i]);
		}
	}

	public static int[] sort(int[] array) {
		int[] rez = new int[array.length];
		int j;

		j = 0;
		rez[0] = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > rez[j]) {
				j++;
				rez[j] = array[i];
				array[i] = -1;
			}
		}

		for (int i = 1; i < array.length; i++) {
			if (array[i] != -1) {
				j++;
				rez[j] = array[i];
				swap(rez, j);
			}
		}

		return rez;
	}
	
	public static void swap(int[] array, int j) {
		while (array[j] < array[j - 1]) {
			int perm = array[j];
			array[j] = array[j - 1];
			array[j - 1] = perm;
			j--;
		}
	}

}
