package by.htp.les07.main;

import java.util.Random;

public class Main34 {

	/*
	 * Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в
	 * каждом столбце число единиц равно номеру столбца.
	 */

	public static void main(String[] args) {
		int[][] ar;
		int m = 5;
		int n = 5;

		ar = array(m, n);
		print(ar);
	}

	public static void print(int[][] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("%d \t", ar[i][j]);
			}
			System.out.println();
		}
	}

	public static int[][] array(int m, int n) {
		int[][] ar = new int[m][n];
		Random rand = new Random();
		int i;
		int j;
		int ind;

		for (i = 0; i < n; i++) {
			for (j = 0; j < i; j++) {
				ind = rand.nextInt(m);
				while (ar[ind][i] == 1) {
					ind = rand.nextInt(m);
				}
				ar[ind][i] = 1;
			}
		}

		return ar;
	}

}
