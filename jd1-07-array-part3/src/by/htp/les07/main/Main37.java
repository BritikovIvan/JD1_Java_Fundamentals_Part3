package by.htp.les07.main;

import java.util.Random;

public class Main37 {

	/*
	 * Переставить строки матрицы случайным образом.
	 */

	public static void main(String[] args) {
		int[][] ar = { { 1, 1, 20 }, { 1, 21, 3 }, { 4, -5, 6 }, { 7, 8, 9 } };

		fun(ar);
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

	public static void fun(int[][] ar) {
		Random rand = new Random();
		int num;
		int[] perm;

		for (int i = 0; i < ar.length; i++) {
			num = rand.nextInt(ar.length);
			if (num != i) {
				perm = ar[i];
				ar[i] = ar[num];
				ar[num] = perm;
			}
		}
	}

}
