package by.htp.les06.main;

public class Main6 {

	/*
	 * Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить
	 * его по возрастанию. Делается это следующим образом: сравниваются два соседних
	 * элемента a(i) и a(i + 1) . Если a(i) <= a(i + 1) , то продвигаются на один
	 * элемент вперед. Если a(i) > a(i + 1) , то производится перестановка и
	 * сдвигаются на один элемент назад. Составить алгоритм этой сортировки.
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
		int h = 1;
		while (h * 3 < array.length)
			h = h * 3 + 1;

		while (h >= 1) {
			hSort(array, h);
			h = h / 3;
		}
	}

	private static void hSort(int[] array, int h) {
		for (int i = h; i < array.length; i++) {
			for (int j = i; j >= h; j = j - h) {
				if (array[j] < array[j - h]) {
					int perm = array[j];
					array[j] = array[j - h];
					array[j - h] = perm;
				} else {
					break;
				}
			}
		}
	}

}
