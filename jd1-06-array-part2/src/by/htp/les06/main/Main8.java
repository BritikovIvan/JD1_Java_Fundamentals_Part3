package by.htp.les06.main;

public class Main8 {

	/*
	 * Даны дроби. Составить программу, которая приводит эти дроби к общему
	 * знаменателю и упорядочивает их в порядке возрастания.
	 */

	public static void main(String[] args) {
		int[][] ar = { {2, 5, 1}, {3, 6, 3} };
		
		print(ar);
		sort(ar);
		System.out.println();
		print(ar);
	}
	
	public static void print(int[][] array) {
		for (int i = 0; i < array[0].length; i++) {
			System.out.print(array[0][i] + "/" + array[1][i] + "\t");
		}
	}
	
	public static void sort(int[][] array) {
		int nok;
		
		nok = nok(array[1]);
		for (int i = 0; i < array[0].length; i++) {
			array[0][i] *= nok / array[1][i];
			array[1][i] = nok;
		}
		
		sort(array[0]);
	}
	
	public static int nok(int[] array) {
		int nok = array[0];
		
		for (int i = 1; i < array.length; i++) {
			nok = nok(nok, array[i]);
		}
		
		return nok;
	}
	
	public static int nok(int i, int j) {
		int nok = i * j / nod(i, j);
		return nok;
	}
	
	public static int nod(int i, int j) {
		if (j == 0) {
			return i;
		} else {
			return nod(j, i % j);
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
