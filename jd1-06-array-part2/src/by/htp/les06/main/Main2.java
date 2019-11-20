package by.htp.les06.main;

public class Main2 {

	/*
	 * Даны две последовательности. Образовать из них новую последовательность чисел
	 * так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не
	 * использовать.
	 */

	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 6 };
		int[] b = { 3, 5, 7 };
		int[] c;

		c = fun(a, b);
		print(c);
	}

	public static void print(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Ar[" + i + "] = " + ar[i]);
		}
	}

	public static int[] fun(int[] a, int[] b) {
		int[] rez;
		int i;
		int j;
		int k;

		rez = new int[a.length + b.length];
		i = 0;
		j = 0;

		for (k = 0; k < rez.length; k++) {
			if (i < a.length && j < b.length) {
				if (a[i] <= b[j]) {
					rez[k] = a[i];
					i++;
				} else {
					rez[k] = b[j];
					j++;
				}
			} else {
				if (i == a.length) {
					for (; k < rez.length; k++) {
						rez[k] = b[j];
						j++;
					}
				} else {
					for (; k < rez.length; k++) {
						rez[k] = a[i];
						i++;
					}
				}
			}
		}

		return rez;
	}

}
