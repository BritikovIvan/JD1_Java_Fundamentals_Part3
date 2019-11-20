package by.htp.les06.main;

public class Main7 {

	/*
	 * Пусть даны две неубывающие последовательности действительных чисел a(n) и
	 * b(m) . Требуется указать те места, на которые нужно вставлять элементы
	 * последовательности b(m) в первую последовательность так, чтобы новая
	 * последовательность оставалась возрастающей.
	 */

	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 4, 7 };
		int[] b = { 3, 5, 8 };
		int[] pl;

		pl = fun(a, b);
		print(pl);
	}

	public static void print(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Pl[" + i + "] = " + ar[i]);
		}
	}

	public static int[] fun(int[] a, int[] b) {
		int[] pl = new int[b.length];
		int[] rez = new int[a.length + b.length];
		int i;
		int j;

		for (i = 0; i < a.length; i++) {
			rez[i] = a[i];
		}

		for (j = 0; j < b.length; j++) {
			rez[i++] = b[j];
		}

		sort(rez);
		i = 0;
		j = 0;

		while (i < rez.length) {
			if (rez[i] == b[j]) {
				pl[j] = i;
				j++;
			}
			i++;
		}

		return pl;
	}

	public static void sort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int ind = search(array, i);
			for (int j = i; j > ind; j--) {
				int perm = array[j];
				array[j] = array[j - 1];
				array[j - 1] = perm;
			}
		}
	}

	public static int search(int[] array, int len) {
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
